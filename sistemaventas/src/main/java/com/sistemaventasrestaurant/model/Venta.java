package com.sistemaventasrestaurant.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Venta {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_venta",nullable=false, updatable=false)
	private Long id;
	
	@Column(nullable=false)
	private String nroDocumento;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(nullable=false)
	private TipoDocumento tipoDocumento;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_comanda", nullable = false)
	private Comanda comanda;
	
	@Column(nullable=false)
	private Double subtotal;
	
	@Column(nullable=false)
	private Double iva;
	
	@Column(nullable=false)
	private Double total;
	
	@Column(nullable=false)
	private Double dscto;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Comanda getComanda() {
		return comanda;
	}

	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getDscto() {
		return dscto;
	}

	public void setDscto(Double dscto) {
		this.dscto = dscto;
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

}
