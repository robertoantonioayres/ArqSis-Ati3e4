package br.usjt.ccp3bn_bua2_previsao_tempo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import br.usjt.ccp3bn_bua2_previsao_tempo.model.Cidade;
import br.usjt.ccp3bn_bua2_previsao_tempo.model.PrevisaoTempo;

public class BuscaCidadeComPrevisaoTempo {

	public static void main(String[] args) {
	
		EntityManager manager = JPAUtil.getEntityManager();
		Cidade cidade = manager.find(Cidade.class, 1L);
		
		List<PrevisaoTempo> previsoesTempo = cidade.getPrevisoesTempo();
		
		for(PrevisaoTempo p:previsoesTempo) {
			System.out.println(p);
		}
		manager.close();
		JPAUtil.close();
	}

}
