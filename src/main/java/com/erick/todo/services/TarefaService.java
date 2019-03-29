package com.erick.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erick.todo.domain.Tarefa;
import com.erick.todo.repositories.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository repo;
	
	public List<Tarefa> getTarefas(){
		return repo.findAll();
	}
	
}
