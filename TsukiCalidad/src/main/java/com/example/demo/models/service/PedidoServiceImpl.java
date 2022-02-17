package com.example.demo.models.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IPedidoDAO;
import com.example.demo.models.entity.Pedidos;


@Service
public class PedidoServiceImpl implements IPedidoService{

	@Autowired
	
	private IPedidoDAO pedidoDAO;
	
	@Override
	public void save(Pedidos pedido) {
		pedidoDAO.save(pedido);
		
	}

	@Override
	public List<Pedidos> findAll() {
		return(List<Pedidos>)pedidoDAO.findAll();
	}

	@Transactional
	@Override
	public void delete(Long id) {
		pedidoDAO.deleteById(id);
		
	}

}
