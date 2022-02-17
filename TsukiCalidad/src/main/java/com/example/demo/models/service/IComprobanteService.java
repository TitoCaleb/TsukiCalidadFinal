package com.example.demo.models.service;

import java.util.List;


import com.example.demo.models.entity.Comprobante;


public interface IComprobanteService {
	public void save(Comprobante comprobante);
	public List<Comprobante> findAll();
	public void delete(Long id);
	
	


}
