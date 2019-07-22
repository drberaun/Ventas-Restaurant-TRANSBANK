package com.sistemaventasrestaurant.test.jms.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.jms.core.JmsTemplate;

import com.sistemaventasrestaurant.test.jms.Sender;

@RunWith(MockitoJUnitRunner.class)
public class VentasMockJMSTest {

	@InjectMocks
	private Sender sender;
	
	JmsTemplate jmsTemplate;
	
	@Before
	public void init(){
	   // ReflectionTestUtils.setField(jmsProducer, "destinationQueue", DESTINATION);
	}
	
	@Test
	public void testSolicitarLasVentasDelDia() {
		
		
	}
	
}
