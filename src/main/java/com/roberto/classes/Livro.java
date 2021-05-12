package com.roberto.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "livro")
public class Livro {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false, unique = true)
	private String nome;
	
	@Column (nullable = false)
	private Integer page;
	
	@Column (nullable = false)
	private Integer chaptres;
	
	@Column (nullable = false)
	private String isbn;
	
	@Column (name="publisher_nome", nullable = false, unique = true)
	private String publisherNome;
	
	private Author author;
}
