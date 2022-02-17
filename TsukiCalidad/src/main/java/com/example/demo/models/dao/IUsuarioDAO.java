package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{
	public Usuario findByUsuario(String usuario);

}
