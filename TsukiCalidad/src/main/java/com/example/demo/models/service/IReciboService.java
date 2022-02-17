package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Recibo;

public interface IReciboService {
	public void guardar(Recibo recibo);
	public List<Recibo> findAll();
	public void delete(Long id);
	
}
