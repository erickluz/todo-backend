package com.erick.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erick.todo.domain.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {

}
