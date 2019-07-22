package com.sistemaventasrestaurant.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Comanda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_comanda",nullable=false, updatable=false)
	private Long id;
	
	@Column(nullable=false)
	private int nroComanda;
	
	@Column(nullable=false)
	private int diaContable;
	
	@Column(nullable=false)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(nullable=false)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
    @Temporal(TemporalType.TIME)
    private Date hora;
    
    @ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Producto> productos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNroComanda() {
		return nroComanda;
	}

	public void setNroComanda(int nroComanda) {
		this.nroComanda = nroComanda;
	}

	public int getDiaContable() {
		return diaContable;
	}

	public void setDiaContable(int diaContable) {
		this.diaContable = diaContable;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}
