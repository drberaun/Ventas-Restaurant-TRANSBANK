package com.sistemaventasrestaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaventasrestaurant.model.Comanda;

public interface RepositorioComanda   extends JpaRepository<Comanda, Long> {

	
	
}
