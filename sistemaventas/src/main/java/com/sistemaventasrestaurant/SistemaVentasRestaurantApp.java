package com.sistemaventasrestaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableJms
public class SistemaVentasRestaurantApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaVentasRestaurantApp.class, args);
	}
}
