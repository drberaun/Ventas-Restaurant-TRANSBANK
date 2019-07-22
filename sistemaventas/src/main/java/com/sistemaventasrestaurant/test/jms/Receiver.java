package com.sistemaventasrestaurant.test.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sistemaventasrestaurant.test.jms.bean.SolicitudListadoVentas;

@Component
public class Receiver {

	static final String URL_VENTAS = "http://localhost:8080/restaurant/ventas";

	@JmsListener(destination = "colaSolicitudes")
	public void receiveMessage(SolicitudListadoVentas solicitudListadoVentas) {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(URL_VENTAS + "?fecha=" + solicitudListadoVentas.getFecha()
				+ "&access_token=" + solicitudListadoVentas.getTokenOAuth2(), String.class);
		System.out.println(result);
	}

}
