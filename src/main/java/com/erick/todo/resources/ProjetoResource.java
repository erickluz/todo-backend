package com.erick.todo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erick.todo.domain.Projeto;
import com.erick.todo.services.ProjetoService;

@RestController
@RequestMapping(value="/projetos")
public class ProjetoResource {

	@Autowired
	private ProjetoService projetoService;
	
	@GetMapping(value="/")
	public ResponseEntity<List<Projeto>> projetos() {
		List<Projeto> projetos = projetoService.getProjetos();
		return ResponseEntity.ok().body(projetos);		
	}
	
}
