package com.cadastro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.domain.Pessoa;
import com.cadastro.repository.PessoaRepository;
import com.cadastro.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	

	@Override
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@Override
	public List<Pessoa> findAll() {
		return (List<Pessoa>) pessoaRepository.findAll();
	}

	@Override
	public Pessoa findOne(Long id) {
		return pessoaRepository.findOne(id);
	}

	@Override
	public void removeCadastro(Long id) {
		
		pessoaRepository.delete(id);
		
	}


	
}
