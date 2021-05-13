package com.roberto.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roberto.classes.Livro;
import com.roberto.dao.LivroRepositor;
import com.roberto.dto.MessageResponseDTO;
import com.roberto.service.LivroService;


@RestController
@RequestMapping ("/api/v1/livro")
public class LivroControle {

	private LivroService livroService;
	
	@Autowired
	public LivroControle(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@PostMapping
	public MessageResponseDTO create(Livro livro) {
		Livro saveLivro = livroRepositor.save(livro);
		return MessageResponseDTO.biulder().message("Recebeu !!"+saveLivro).biulder();
		
	}

}
