package com.cadastro.service;

import java.util.List;

import com.cadastro.domain.Pessoa;

public interface PessoaService {
	
	
	Pessoa save(Pessoa pessoa);
	
	List<Pessoa> findAll();
	
	Pessoa findOne(Long id);

	void removeCadastro(Long id);
	
}
