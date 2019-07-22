package com.sistemaventasrestaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaventasrestaurant.model.Producto;

public interface RepositorioProducto  extends JpaRepository<Producto, Long> {

}
