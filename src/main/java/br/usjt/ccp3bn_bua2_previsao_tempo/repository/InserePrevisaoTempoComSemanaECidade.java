package br.usjt.ccp3bn_bua2_previsao_tempo.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.ccp3bn_bua2_previsao_tempo.ConverteStringForDate;
import br.usjt.ccp3bn_bua2_previsao_tempo.model.Cidade;
import br.usjt.ccp3bn_bua2_previsao_tempo.model.DiaDaSemana;
import br.usjt.ccp3bn_bua2_previsao_tempo.model.PrevisaoTempo;

public class InserePrevisaoTempoComSemanaECidade {
	
	public static void main (String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		
		DiaDaSemana diaDaSemana = new DiaDaSemana();
		diaDaSemana.setNomeDaSemana("Domingo");
		manager.persist(diaDaSemana);
		
		DiaDaSemana diaDaSemana2 = new DiaDaSemana();
		diaDaSemana2.setNomeDaSemana("Domingo");
		manager.persist(diaDaSemana2);
		
		Cidade cidade = new Cidade();
		cidade.setNome("Sao Paulo");
		cidade.setLatitude(-23.5475);
		cidade.setLongitude(-46.63611);
		manager.persist(cidade);
		
		PrevisaoTempo previsaoTempo = new PrevisaoTempo();
		previsaoTempo.setDescricao("Sol com algumas nuvens. Não chove");
		previsaoTempo.setTemperaturaMin(13.0);
		previsaoTempo.setTemperaturaMax(25.0);
		previsaoTempo.setHumidadeRelativa(81);
		
		ConverteStringForDate convData = new ConverteStringForDate();
		previsaoTempo.setDataHora(convData.convertDate("12/04/2020 12:30"));
		
		previsaoTempo.setCidade(cidade);
		previsaoTempo.setDiaDaSemana(diaDaSemana);
		//manager.persist(previsaoTempo);
		
		PrevisaoTempo previsaoTempo2 = new PrevisaoTempo();
		previsaoTempo2.setDescricao("Sol com algumas nuvens. Não chove");
		previsaoTempo2.setTemperaturaMin(16.0);
		previsaoTempo2.setTemperaturaMax(25.0);
		previsaoTempo2.setHumidadeRelativa(70);
		
		ConverteStringForDate convData2 = new ConverteStringForDate();
		previsaoTempo2.setDataHora(convData2.convertDate("12/04/2020 20:40"));
		
		previsaoTempo2.setCidade(cidade);
		previsaoTempo2.setDiaDaSemana(diaDaSemana2);
		
		manager.persist(previsaoTempo);
		manager.persist(previsaoTempo2);
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();
		
	}

}
