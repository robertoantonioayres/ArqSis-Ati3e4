package br.usjt.ccp3bn_bua2_previsao_tempo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_dia_semana")
public class DiaDaSemana {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeDaSemana;
	
	@OneToOne(mappedBy = "diaDaSemana", cascade = CascadeType.ALL)
	private PrevisaoTempo previsaTempo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDaSemana() {
		return nomeDaSemana;
	}
	public void setNomeDaSemana(String nomeDaSemana) {
		this.nomeDaSemana = nomeDaSemana;
	}
	public PrevisaoTempo getPrevisaTempo() {
		return previsaTempo;
	}
	public void setPrevisaTempo(PrevisaoTempo previsaTempo) {
		this.previsaTempo = previsaTempo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiaDaSemana other = (DiaDaSemana) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "DiaDaSemana [id=" + id + ", nomeDaSemana=" + nomeDaSemana + "]";
	}
	
	
	
	
	

}
