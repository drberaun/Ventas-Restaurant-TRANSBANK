package com.sistemaventasrestaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaventasrestaurant.model.*;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{

	Usuario findOneByNombreUsuario(String nombreUsuario);
	
}
