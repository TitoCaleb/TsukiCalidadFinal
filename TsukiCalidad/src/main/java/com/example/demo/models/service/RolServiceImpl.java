package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IRolDAO;
import com.example.demo.models.entity.Rol;

@Service
public class RolServiceImpl implements IRolService{

	@Autowired
	private IRolDAO rolDAO;
	
	@Override
	public List<Rol> findAll() {
		return (List<Rol>)rolDAO.findAll();
	}

}
