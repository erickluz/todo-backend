package com.erick.todo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.erick.todo.domain.Projeto;
import com.erick.todo.domain.Tarefa;
import com.erick.todo.repositories.ProjetoRepository;
import com.erick.todo.repositories.TarefaRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Autowired
	private ProjetoRepository projetoRepo;

	@Autowired
	private TarefaRepository tarefaRepo;

	@Override
	public void run(String... args) throws Exception {

		Projeto p1 = new Projeto(null, "Casa Blanca", "Fazer o filme");
		Projeto p2 = new Projeto(null, "Duro de matar", "Fazer o filme");
		Projeto p3 = new Projeto(null, "Duro de matar 2", "Fazer o filme");
		Projeto p4 = new Projeto(null, "Duro de matar 3", "Fazer o filme");
		Projeto p5 = new Projeto(null, "Missao impossivel", "Fazer o filme");

		// Tarefas p1
		Tarefa t1 = new Tarefa(null, "Escrever roteiro", "t");
		Tarefa t2 = new Tarefa(null, "Comprar Cameras", "t");
		Tarefa t3 = new Tarefa(null, "Contratar atores", "t");
		Tarefa t4 = new Tarefa(null, "Contratar cameramans", "f");
		Tarefa t5 = new Tarefa(null, "Filmar", "f");
		// Tarefas p2
		Tarefa t6 = new Tarefa(null, "Escrever roteiro", "t");
		Tarefa t7 = new Tarefa(null, "Comprar Cameras", "t");
		Tarefa t8 = new Tarefa(null, "Contratar atores", "t");
		Tarefa t9 = new Tarefa(null, "Contratar cameramans", "f");
		Tarefa t10 = new Tarefa(null, "Filmar", "f");
		// Tarefas p3
		Tarefa t11 = new Tarefa(null, "Escrever roteiro", "t");
		Tarefa t12 = new Tarefa(null, "Comprar Cameras", "t");
		Tarefa t13 = new Tarefa(null, "Contratar atores", "t");
		Tarefa t14 = new Tarefa(null, "Contratar cameramans", "f");
		Tarefa t15 = new Tarefa(null, "Filmar", "f");
		// Tarefas p4
		Tarefa t16 = new Tarefa(null, "Escrever roteiro", "t");
		Tarefa t17 = new Tarefa(null, "Comprar Cameras", "t");
		Tarefa t18 = new Tarefa(null, "Contratar atores", "t");
		Tarefa t19 = new Tarefa(null, "Contratar cameramans", "f");
		Tarefa t20 = new Tarefa(null, "Filmar", "f");
		// Tarefas p5
		Tarefa t21 = new Tarefa(null, "Escrever roteiro", "t");
		Tarefa t22 = new Tarefa(null, "Comprar Cameras", "t");
		Tarefa t23 = new Tarefa(null, "Contratar atores", "t");
		Tarefa t24 = new Tarefa(null, "Contratar cameramans", "f");
		Tarefa t25 = new Tarefa(null, "Filmar", "f");

		p1.setTarefas(Arrays.asList(t1, t2, t3, t4, t5));
		p2.setTarefas(Arrays.asList(t6, t7, t8, t9, t10));
		p3.setTarefas(Arrays.asList(t11, t12, t13, t14, t15));
		p4.setTarefas(Arrays.asList(t16, t17, t18, t19, t20));
		p5.setTarefas(Arrays.asList(t21, t22, t23, t24, t25));
		
		t1.setProjeto(p1);
		t2.setProjeto(p1);
		t3.setProjeto(p1);
		t4.setProjeto(p1);
		t5.setProjeto(p1);
		
		t6.setProjeto(p2);
		t7.setProjeto(p2);
		t8.setProjeto(p2);
		t9.setProjeto(p2);
		t10.setProjeto(p2);
		
		t11.setProjeto(p3);
		t12.setProjeto(p3);
		t13.setProjeto(p3);
		t14.setProjeto(p3);
		t15.setProjeto(p3);
		
		t16.setProjeto(p4);
		t17.setProjeto(p4);
		t18.setProjeto(p4);
		t18.setProjeto(p4);
		t20.setProjeto(p4);
		
		t21.setProjeto(p5);
		t22.setProjeto(p5);
		t23.setProjeto(p5);
		t24.setProjeto(p5);
		t25.setProjeto(p5);

		projetoRepo.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		tarefaRepo.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17,
											t18, t19, t20, t21, t22, t23, t24, t25));
		
		
	}

}
