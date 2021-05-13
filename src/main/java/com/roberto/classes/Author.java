package com.roberto.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table( name = "author")
public class Author {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	// Não pode ser null e o valor valor dele e unico
	@Column (nullable = false, unique = true)
	private String nome;
	// Não pode ser null e o valor valor dele e unico
	@Column (nullable = false)
	private Integer age;

	
}
