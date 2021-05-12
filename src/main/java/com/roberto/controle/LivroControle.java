package com.roberto.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roberto.classes.Livro;
import com.roberto.dao.Livrorepositor;
import com.roberto.dto.MessageResponseDTO;

@SuppressWarnings("unused")
@RestController
@RequestMapping ("/api/v1/livros")
public class LivroControle {

	private Livrorepositor livrorepositor;
	
	@Autowired
	public void LivroController(Livrorepositor livrorepositor) {
		this.livrorepositor = livrorepositor;
	}
	
	@PostMapping
	public String create(@RequestBody Livro  livro) {
		Livro saveLivro = livrorepositor.save(livro);
		return MessageResponseDTO.getMessage().toString();
		
	}
}
