package com.cadastromv.model.dao;

import java.util.List;

import com.cadastromv.model.Pessoa;

public interface CadastroDao {
	
	Pessoa salvarPessoa(Pessoa pessoa);
	
	void alterar(Pessoa pessoa);
	
	void excluir(Pessoa pessoa);
	
	List<Pessoa> getPessoa();

}
