package com.erick.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erick.todo.domain.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {

}
