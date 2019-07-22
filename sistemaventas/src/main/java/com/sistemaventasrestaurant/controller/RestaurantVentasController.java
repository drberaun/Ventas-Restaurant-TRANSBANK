package com.sistemaventasrestaurant.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaventasrestaurant.controller.bean.CrearVentaDeComandaRequest;
import com.sistemaventasrestaurant.controller.bean.CrearVentaDeComandaResponse;
import com.sistemaventasrestaurant.model.Venta;
import com.sistemaventasrestaurant.repository.RepositorioVenta;

@RestController
public class RestaurantVentasController {
	@Autowired
	private RepositorioVenta repositorioVenta;
	
	@GetMapping(value="/restaurant")
	public String restaurant() {
		return "bienvenido a restaurant DEMO";
	}
	
	@GetMapping(value="/restaurant/ventas", produces = "application/json")
	public List<Venta> ventasByDate( @RequestParam(name = "fecha")
    @DateTimeFormat(iso = ISO.DATE)
    LocalDate fecha) {
		
		List<Venta> ventasByFecha = null;		
		Date date = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		try {
			ventasByFecha = repositorioVenta.findByFecha(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ventasByFecha;
	}
	
	@PostMapping(path="/restaurant/ventas", consumes = "application/json", produces = "application/json")
	public CrearVentaDeComandaResponse crearVentaDeComanda(@RequestBody CrearVentaDeComandaRequest crearVentaDeComandaRequest)
	{
		CrearVentaDeComandaResponse crearVentaDeComandaResponse = new CrearVentaDeComandaResponse();
		try {
			crearVentaDeComandaResponse.setNroDocumento(repositorioVenta.crearVentaDeComanda(crearVentaDeComandaRequest.getId_comanda(), crearVentaDeComandaRequest.getTipoDocumento(), crearVentaDeComandaRequest.getDcto()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			crearVentaDeComandaResponse.setNroDocumento(null);
		}
		return crearVentaDeComandaResponse;
	}
	
}
