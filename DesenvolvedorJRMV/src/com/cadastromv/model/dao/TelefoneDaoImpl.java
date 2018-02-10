package com.cadastromv.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cadastromv.model.Telefone;

public class TelefoneDaoImpl implements TelefoneDao {
	
	@PersistenceContext(unitName="DesenvolvedorJRMV")
	private EntityManager entityManager;

	@Override
	public Telefone salvarTelefone(Telefone telefone) {
		entityManager.persist(telefone);
		return telefone;
	}

	@Override
	public void alterar(Telefone telefone) {
		Telefone telefoneMerge = entityManager.merge(telefone);
		entityManager.persist(telefoneMerge);
		
	}

	@Override
	public void excluir(Telefone telefone) {
		Telefone telefoneMerge = entityManager.merge(telefone);
		entityManager.remove(telefoneMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Telefone> getTelefones() {
		Query query = entityManager.createQuery("from Telefone");
		return query.getResultList();
	}
	
	

}
