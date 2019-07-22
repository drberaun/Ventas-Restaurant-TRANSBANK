package com.sistemaventasrestaurant.controller.bean;

public class CrearVentaDeComandaRequest {
	private int id_comanda;
	private int tipoDocumento; 
	private double dcto;
	
	public int getId_comanda() {
		return id_comanda;
	}
	public void setId_comanda(int id_comanda) {
		this.id_comanda = id_comanda;
	}
	public int getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public double getDcto() {
		return dcto;
	}
	public void setDcto(double dcto) {
		this.dcto = dcto;
	}
}
