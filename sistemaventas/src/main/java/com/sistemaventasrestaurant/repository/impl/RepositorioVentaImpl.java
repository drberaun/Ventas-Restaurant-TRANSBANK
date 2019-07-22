package com.sistemaventasrestaurant.repository.impl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistemaventasrestaurant.model.Comanda;
import com.sistemaventasrestaurant.model.Producto;
import com.sistemaventasrestaurant.model.TipoDocumento;
import com.sistemaventasrestaurant.model.Venta;
import com.sistemaventasrestaurant.repository.RepositorioComanda;
import com.sistemaventasrestaurant.repository.RepositorioVenta;


public class RepositorioVentaImpl {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private RepositorioComanda repositorioComanda;
	
	@Autowired
	private RepositorioVenta repositorioVenta;

	public String crearVentaDeComanda(int id_comanda, int tipoDocumento, double dcto) throws Exception {
		// TODO Auto-generated method stub
		String nroDocumento=null;
		Comanda comanda = repositorioComanda.findOne(Long.valueOf(String.valueOf(id_comanda)));
		
		
		if (comanda!=null)
		{
			
			Venta ventaEntity = new Venta();
			ventaEntity.setComanda(comanda);
			ventaEntity.setNroDocumento("000" + comanda.getId());
			ventaEntity.setTipoDocumento(TipoDocumento.valueOf(tipoDocumento));
			ventaEntity.setDiaContable(comanda.getDiaContable());
			ventaEntity.setFecha(new Date());
			ventaEntity.setHora(new Date());
			
			Double total = 0.0;
			Double subTotal = 0.0;
			Double iva = 0.0;
			Double montoDcto = 0.0;
			
			for (Producto producto: comanda.getProductos())
			{
				subTotal = subTotal + producto.getPrecio();
			}
			
			iva = subTotal * 0.19;
			
			total = subTotal + iva;
			
			montoDcto = total * (dcto/100);
			
			ventaEntity.setSubtotal(subTotal);
			ventaEntity.setIva(iva);
			ventaEntity.setTotal(total - montoDcto);
			ventaEntity.setDscto(montoDcto);		
			
			nroDocumento = repositorioVenta.save(ventaEntity).getNroDocumento();
			
		}
		
		return nroDocumento;
	}
	
	@SuppressWarnings("unchecked")
	public List<Venta> findByFecha(Date fecha) throws Exception {
		
		 String queryStr = "select * from restaurant.venta where fecha = ?1";
		 
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 
		 Query query = entityManager.createNativeQuery(queryStr);
         query.setParameter(1, dateFormat.format(fecha));

		 return query.getResultList();

	}

}
