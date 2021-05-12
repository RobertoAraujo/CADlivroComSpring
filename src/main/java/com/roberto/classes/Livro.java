package com.roberto.classes;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	@JoinColumn (name="author_id")
	private Author author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getChaptres() {
		return chaptres;
	}

	public void setChaptres(Integer chaptres) {
		this.chaptres = chaptres;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisherNome() {
		return publisherNome;
	}

	public void setPublisherNome(String publisherNome) {
		this.publisherNome = publisherNome;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, chaptres, id, isbn, nome, page, publisherNome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(author, other.author) && Objects.equals(chaptres, other.chaptres)
				&& Objects.equals(id, other.id) && Objects.equals(isbn, other.isbn) && Objects.equals(nome, other.nome)
				&& Objects.equals(page, other.page) && Objects.equals(publisherNome, other.publisherNome);
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + ", page=" + page + ", chaptres=" + chaptres + ", isbn=" + isbn
				+ ", publisherNome=" + publisherNome + ", author=" + author + "]";
	}
	
	
}
