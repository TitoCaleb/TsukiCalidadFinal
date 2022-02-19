package com.example.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "fac_id")
	private Long fac_id;
	
	@Column(name = "fac_detalle")
	private String fac_detalle;
	
	@Column(name = "fac_ruc")
	private String fac_ruc;
	
	@Column(name = "fac_subtotal")
	private Double fac_subtotal;
	
	@Column(name = "fac_igv")
	private Double fac_igv;
	
	@Column(name = "fac_total")
	private Double fac_total;
	
	@Column(name = "fac_razon")
	private String fac_razon;
	
	@ManyToOne
	@JoinColumn(name = "p_id")
	private Pedidos pedidos;
	
	@ManyToOne
	@JoinColumn(name = "r_id")
	private Reparto reparto;

	public Long getFac_id() {
		return fac_id;
	}

	public void setFac_id(Long fac_id) {
		this.fac_id = fac_id;
	}

	public String getFac_detalle() {
		return fac_detalle;
	}

	public void setFac_detalle(String fac_detalle) {
		this.fac_detalle = fac_detalle;
	}

	public String getFac_ruc() {
		return fac_ruc;
	}

	public void setFac_ruc(String fac_ruc) {
		this.fac_ruc = fac_ruc;
	}

	public Double getFac_subtotal() {
		return fac_subtotal;
	}

	public void setFac_subtotal(Double fac_subtotal) {
		this.fac_subtotal = fac_subtotal;
	}

	public Double getFac_igv() {
		return fac_igv;
	}

	public void setFac_igv(Double fac_igv) {
		this.fac_igv = fac_igv;
	}

	public Double getFac_total() {
		return fac_total;
	}

	public void setFac_total(Double fac_total) {
		this.fac_total = fac_total;
	}

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

	public Reparto getReparto() {
		return reparto;
	}

	public void setReparto(Reparto reparto) {
		this.reparto = reparto;
	}
	
	public String getFac_razon() {
		return fac_razon;
	}

	public void setFac_razon(String fac_razon) {
		this.fac_razon = fac_razon;
	}

	
}
