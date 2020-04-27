package br.usjt.ccp3bn_bua2_previsao_tempo.repository;

import javax.persistence.EntityManager;

import br.usjt.ccp3bn_bua2_previsao_tempo.model.PrevisaoTempo;

public class BuscaPrevisaoTempoComSemanaECidade {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		PrevisaoTempo previsaoTempo = manager.find(PrevisaoTempo.class, 1L);
		
		System.out.println(previsaoTempo);
		
		manager.close();
		JPAUtil.close();
		
	}

}
