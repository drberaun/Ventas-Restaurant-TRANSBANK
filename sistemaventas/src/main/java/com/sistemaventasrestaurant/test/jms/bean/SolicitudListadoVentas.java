package com.sistemaventasrestaurant.test.jms.bean;

import java.time.LocalDate;

public class SolicitudListadoVentas {
	String tokenOAuth2;
	LocalDate fecha;
	public String getTokenOAuth2() {
		return tokenOAuth2;
	}
	public void setTokenOAuth2(String tokenOAuth2) {
		this.tokenOAuth2 = tokenOAuth2;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
}
