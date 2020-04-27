package br.usjt.ccp3bn_bua2_previsao_tempo.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ccp3bn_bua2_previsao_tempo.model.DiaDaSemana;
import br.usjt.ccp3bn_bua2_previsao_tempo.model.PrevisaoTempo;

public class RemovePrevisaoTempoEDiaSemana {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		PrevisaoTempo previsaoTempo = manager.find(PrevisaoTempo.class, 1L);
		DiaDaSemana diaDaSemana = manager.find(DiaDaSemana.class, previsaoTempo.getDiaDaSemana().getId());
		
		manager.remove(previsaoTempo);
		manager.remove(diaDaSemana);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}

}
