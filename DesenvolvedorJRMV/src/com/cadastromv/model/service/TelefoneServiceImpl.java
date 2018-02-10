package com.cadastromv.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.cadastromv.model.Telefone;
import com.cadastromv.model.dao.TelefoneDao;

public class TelefoneServiceImpl implements TelefoneService {

	
	@Inject
	public TelefoneDao telefoneDao; 
	
	@Override
	@Transactional
	public Telefone salvarTelefone(Telefone telefone) {
		return telefoneDao.salvarTelefone(telefone);
	}

	@Override
	@Transactional
	public void alterar(Telefone telefone) {
		telefoneDao.alterar(telefone);
		
	}

	@Override
	@Transactional
	public void excluir(Telefone telefone) {
		telefoneDao.excluir(telefone);
		
	}

	@Override
	public List<Telefone> getTelefones() {
		return telefoneDao.getTelefones();
	}

}
