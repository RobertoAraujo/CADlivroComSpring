package com.roberto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.roberto.classes.Livro;
import com.roberto.dao.LivroRepositor;
import com.roberto.dto.MessageResponseDTO;

@Service
public class LivroService {
	
	private LivroRepositor livroRepositor;

	@Autowired
	public void LivroController(LivroRepositor livroRepositor) {
		this.livroRepositor = livroRepositor;
	}
	
	@PostMapping
	public MessageResponseDTO create(Livro  livro) {
		Livro saveLivro = livroRepositor.save(livro);
		return create(saveLivro);
		
	}

}
