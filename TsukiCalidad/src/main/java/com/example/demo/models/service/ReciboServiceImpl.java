package com.example.demo.models.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IReciboDAO;
import com.example.demo.models.entity.Recibo;

@Service
public class ReciboServiceImpl implements IReciboService {
	
	@Autowired
	private IReciboDAO reciboDAO;

	@Override
	public void guardar(Recibo recibo) {
		reciboDAO.save(recibo);
		
	}

	@Override
	public List<Recibo> findAll() {
		return (List<Recibo>)reciboDAO.findAll();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		reciboDAO.deleteById(id);
		
	}

}
