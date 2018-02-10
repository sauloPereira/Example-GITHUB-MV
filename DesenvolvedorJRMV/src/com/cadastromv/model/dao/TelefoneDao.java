package com.cadastromv.model.dao;

import java.util.List;

import com.cadastromv.model.Telefone;

public interface TelefoneDao {

	Telefone salvarTelefone(Telefone telefone);
	
	void alterar(Telefone telefone);
	
	void excluir(Telefone telefone);
	
	List<Telefone> getTelefones();
	
}
