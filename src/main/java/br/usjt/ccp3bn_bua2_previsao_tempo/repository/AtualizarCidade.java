package br.usjt.ccp3bn_bua2_previsao_tempo.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ccp3bn_bua2_previsao_tempo.model.Cidade;

public class AtualizarCidade {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		Cidade cidade = manager.find(Cidade.class, 1L);
		
		cidade.setNome("Tokyo");
		cidade.setLatitude(35.6894);
		cidade.setLongitude(139.692);
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();
	}

}
