package com.erick.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erick.todo.domain.Usuario;
import com.erick.todo.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public List<Usuario> getUsuarios(){
		return repo.findAll();
	}
	
}
