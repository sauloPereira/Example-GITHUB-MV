package com.cadastromv.model.service;

import java.util.List;

import com.cadastromv.model.Pessoa;

public interface PessoaService {

	Pessoa salvarPessoa(Pessoa pessoa);
	
	void alterar(Pessoa pessoa);
	
	void excluir(Pessoa pessoa);
	
	List<Pessoa> getPessoa();
		
	
}
