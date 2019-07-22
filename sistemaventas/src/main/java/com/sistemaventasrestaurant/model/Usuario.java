package com.sistemaventasrestaurant.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Usuario implements UserDetails{
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id_usuario",nullable=false, updatable=false)
		private Long id;
		
		@Column(nullable=false, unique=true)
		private String nombreUsuario;
		
		@Column(nullable=false)		
		private String password;
		
		@Column(nullable=false)
		private boolean activo;
		
		@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
		private List<Rol> roles;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombreusuario() {
			return nombreUsuario;
		}

		public void setNombreusuario(String nombreusuario) {
			this.nombreUsuario = nombreusuario;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isActivo() {
			return activo;
		}

		public void setActivo(boolean activo) {
			this.activo = activo;
		}

		public List<Rol> getRoles() {
			return roles;
		}

		public void setRoles(List<Rol> roles) {
			this.roles = roles;
		}

		public Collection<? extends GrantedAuthority> getAuthorities() {
			List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
			for (Rol rol: roles){
				String nombre = rol.getNombre().toUpperCase();
				grantedAuthorities.add(new SimpleGrantedAuthority(nombre));
			}
			return grantedAuthorities;
		}

		public String getUsername() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}

		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}
}
