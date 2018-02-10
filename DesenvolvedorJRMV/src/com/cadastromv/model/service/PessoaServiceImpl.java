package com.cadastromv.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.cadastromv.model.Pessoa;
import com.cadastromv.model.dao.CadastroDao;

public class PessoaServiceImpl implements PessoaService {
	
	
	@Inject
	public CadastroDao cadastroDao;

	
	@Override
	@Transactional
	public Pessoa salvarPessoa(Pessoa pessoa) {
		
		return cadastroDao.salvarPessoa(pessoa);
	}

	@Override
	@Transactional
	public void alterar(Pessoa pessoa) {
		
		cadastroDao.alterar(pessoa);
	}

	@Override
	public void excluir(Pessoa pessoa) {
		
		cadastroDao.excluir(pessoa);
	}

	@Override
	public List<Pessoa> getPessoa() {
		
		return cadastroDao.getPessoa();
	}

}
