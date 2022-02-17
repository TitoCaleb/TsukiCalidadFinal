package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Pedidos;

public interface IPedidoService {
	public void save(Pedidos pedidos);
	public List<Pedidos> findAll();
	public void delete(Long id);
	
}
