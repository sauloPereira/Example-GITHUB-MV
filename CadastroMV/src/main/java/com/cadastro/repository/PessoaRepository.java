package com.cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import com.cadastro.domain.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

	
}
