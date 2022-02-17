package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Pedidos;

public interface IPedidoDAO extends CrudRepository<Pedidos, Long>{

}
