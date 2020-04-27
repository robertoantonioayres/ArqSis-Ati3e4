package br.usjt.ccp3bn_bua2_previsao_tempo.repository;

import javax.persistence.Persistence;

public class CriarBaseETabelas {
	
	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("usjtPU");
		
	}

}
