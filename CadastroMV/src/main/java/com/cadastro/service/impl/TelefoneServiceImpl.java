package com.cadastro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cadastro.domain.Telefone;
import com.cadastro.repository.TelefoneRepository;
import com.cadastro.service.TelefoneService;


@Service
public class TelefoneServiceImpl implements TelefoneService {

	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Override
	public Telefone updateTelefone(Telefone telefone) {
		
		return telefoneRepository.save(telefone);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Telefone> findTelefoneList(Long id) {
		
		return (List<Telefone>) telefoneRepository.findOne(id);
	}

}
