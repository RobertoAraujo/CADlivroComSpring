package com.roberto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roberto.classes.Livro;

public interface Livrorepositor extends JpaRepository<Livro, Long> {

}
