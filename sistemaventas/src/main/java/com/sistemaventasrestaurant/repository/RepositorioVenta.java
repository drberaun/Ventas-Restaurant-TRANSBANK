package com.sistemaventasrestaurant.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaventasrestaurant.model.Venta;

public interface RepositorioVenta  extends JpaRepository<Venta, Long>{
	
	String crearVentaDeComanda(int id_comanda, int tipoDocumento, double dcto) throws Exception;
	
	public List<Venta> findByFecha(Date fecha) throws Exception;

}
