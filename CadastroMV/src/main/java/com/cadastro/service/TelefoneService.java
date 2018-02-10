package com.cadastro.service;

import java.util.List;

import com.cadastro.domain.Telefone;

public interface TelefoneService {
	
	Telefone updateTelefone(Telefone telefone);

	List<Telefone> findTelefoneList(Long id); 
	
	
	
}
