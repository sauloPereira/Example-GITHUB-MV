package com.cadastromv.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cadastromv.model.Pessoa;

public class CadastroDaoImpl implements CadastroDao {
	
	@PersistenceContext(unitName="DesenvolvedorJRMV")
	private EntityManager entityManager;

	@Override
	public Pessoa salvarPessoa(Pessoa pessoa) {
		entityManager.persist(pessoa);
		return pessoa;
		
	}

	@Override
	public void alterar(Pessoa pessoa) {
		Pessoa pessoaMerge = entityManager.merge(pessoa);
		entityManager.persist(pessoaMerge);
		
	}

	@Override
	public void excluir(Pessoa pessoa) {
		Pessoa pessoaMerge = entityManager.merge(pessoa);
		entityManager.remove(pessoaMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Pessoa> getPessoa() {
		Query query = entityManager.createQuery("from Pessoa");
		return query.getResultList();
	}
	
	

}
