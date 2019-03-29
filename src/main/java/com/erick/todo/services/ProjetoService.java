package com.erick.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erick.todo.domain.Projeto;
import com.erick.todo.repositories.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository repo;
	
	public List<Projeto> getProjetos(){
		return repo.findAll();
	}
	
}
