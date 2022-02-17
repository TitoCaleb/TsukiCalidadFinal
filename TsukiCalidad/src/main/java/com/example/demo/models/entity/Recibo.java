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
@Table(name = "recibo")
public class Recibo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rec_id")
	private Long rec_id;
	
	@Column(name = "rec_detalle")
	private String rec_detalle;
	
	@Column(name = "rec_total")
	private Double rec_total;
	
	@ManyToOne
	@JoinColumn(name = "p_id")
	private Pedidos pedidos;
	
	@ManyToOne
	@JoinColumn(name = "r_id")
	private Reparto reparto;

	public Long getRec_id() {
		return rec_id;
	}

	public void setRec_id(Long rec_id) {
		this.rec_id = rec_id;
	}

	public String getRec_detalle() {
		return rec_detalle;
	}

	public void setRec_detalle(String rec_detalle) {
		this.rec_detalle = rec_detalle;
	}

	public Double getRec_total() {
		return rec_total;
	}

	public void setRec_total(Double rec_total) {
		this.rec_total = rec_total;
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


}
