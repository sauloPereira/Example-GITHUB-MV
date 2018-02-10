package com.cadastromv.model.service;

import java.util.List;

import com.cadastromv.model.Telefone;

public interface TelefoneService {

	Telefone salvarTelefone(Telefone telefone);
	
	void alterar(Telefone telefone);
	
	void excluir(Telefone telefone);
	
	List<Telefone> getTelefones();
	
}
