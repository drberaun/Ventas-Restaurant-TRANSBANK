package com.sistemaventasrestaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sistemaventasrestaurant.repository.RepositorioUsuario;

@Service("userDetailsService")
public class ServicioUsuario implements UserDetailsService{

	@Autowired
	private RepositorioUsuario repositorioUsuario;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return repositorioUsuario.findOneByNombreUsuario(username);
	}

}
