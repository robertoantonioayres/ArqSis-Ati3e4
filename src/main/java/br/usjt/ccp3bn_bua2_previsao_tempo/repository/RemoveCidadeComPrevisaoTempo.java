package br.usjt.ccp3bn_bua2_previsao_tempo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ccp3bn_bua2_previsao_tempo.model.Cidade;
import br.usjt.ccp3bn_bua2_previsao_tempo.model.DiaDaSemana;
import br.usjt.ccp3bn_bua2_previsao_tempo.model.PrevisaoTempo;

public class RemoveCidadeComPrevisaoTempo {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Cidade cidade = manager.find(Cidade.class, 1L);
		
		List<PrevisaoTempo> previsaoTempo = cidade.getPrevisoesTempo();
		
		for(PrevisaoTempo p: previsaoTempo) {
			
			DiaDaSemana diaDaSemana = manager.find(DiaDaSemana.class, p.getDiaDaSemana().getId());
			manager.remove(p);
			manager.remove(diaDaSemana);
			
		}
					
		manager.remove(cidade);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
				
	}

}
