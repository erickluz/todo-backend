package com.erick.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erick.todo.domain.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

}
