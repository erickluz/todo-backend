package com.erick.todo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.erick.todo.domain.Projeto;
import com.erick.todo.domain.Tarefa;

public class ProjetoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String descricao;
	private List<Tarefa> itens = new ArrayList<>();
	
	public ProjetoDTO(Projeto projeto) {
		this.id = projeto.getId();
		this.nome = projeto.getNome();
		this.descricao = projeto.getDescricao();
		this.itens = projeto.getTarefas();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Tarefa> getItens() {
		return itens;
	}

	public void setItens(List<Tarefa> itens) {
		this.itens = itens;
	}
	
	
	
	
	
}
