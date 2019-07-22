package com.sistemaventasrestaurant.test.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.sistemaventasrestaurant.test.jms.bean.SolicitudListadoVentas;

@Component
public class Sender {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void send(SolicitudListadoVentas solicitudListadoVentas){
	    jmsTemplate.convertAndSend("colaSolicitudes", solicitudListadoVentas);
	}
}
