package br.usjt.ccp3bn_bua2_previsao_tempo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.usjt.ccp3bn_bua2_previsao_tempo.model.PrevisaoTempo;

public class ListaTodasPrevisaoTempoComSemana {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from PrevisaoTempo");
		List<PrevisaoTempo> previsoesTempo = query.getResultList();
		
		for (PrevisaoTempo previsaoTempo : previsoesTempo) {
			
			System.out.println(previsaoTempo);
		}
		
		manager.close();
		JPAUtil.close();

	}

}
