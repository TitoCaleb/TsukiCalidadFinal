package com.example.demo.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IComprobanteDAO;
//import com.example.demo.models.dao.IProductoDAO;
import com.example.demo.models.entity.Comprobante;



@Service
public class ComprobanteServiceImpl implements IComprobanteService {

	@Autowired
	private IComprobanteDAO comprobanteDAO;
	

	
	//@Autowired
	//private IProductoDAO productoDAO;
	
	@Override
	public void save(Comprobante comprobante) {
		comprobanteDAO.save(comprobante);		
	}

	@Override
	public List<Comprobante> findAll() {
		return (List<Comprobante>)comprobanteDAO.findAll();
	}
	

	@Override
	@Transactional
	public void delete(Long id) {
		comprobanteDAO.deleteById(id);
	}


}
