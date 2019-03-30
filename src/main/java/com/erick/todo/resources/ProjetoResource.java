package com.erick.todo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erick.todo.domain.Projeto;
import com.erick.todo.dto.ProjetoDTO;
import com.erick.todo.services.ProjetoService;

@RestController
@RequestMapping("/projetos")
public class ProjetoResource {

	@Autowired
	private ProjetoService projetoService;
	
	@GetMapping("/")
	public ResponseEntity<List<ProjetoDTO>> listarProjetos(){
		List<Projeto> projetos = projetoService.listarProjetos();
		
		List<ProjetoDTO> projetosDTO = projetos.stream().map( x -> new ProjetoDTO(x)).collect(Collectors.toList());
				
		return ResponseEntity.ok().body(projetosDTO);
	}
	
}
