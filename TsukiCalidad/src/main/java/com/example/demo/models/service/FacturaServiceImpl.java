package com.example.demo.models.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IFacturaDAO;
import com.example.demo.models.entity.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService {
	
	@Autowired
	private IFacturaDAO facturaDAO;
	
	@Override
	public void guardar(Factura factura) {
		facturaDAO.save(factura);
	}

	@Override
	public List<Factura> listaFacturas() {
		return (List<Factura>)facturaDAO.findAll();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		facturaDAO.deleteById(id);
		
	}

}
