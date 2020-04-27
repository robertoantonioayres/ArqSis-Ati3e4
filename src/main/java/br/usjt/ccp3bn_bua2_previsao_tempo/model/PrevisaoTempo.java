package br.usjt.ccp3bn_bua2_previsao_tempo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "tb_previsao_tempo")
public class PrevisaoTempo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Double temperaturaMin;
	private Double temperaturaMax;
	public Double getTemperaturaMin() {
		return temperaturaMin;
	}
	public void setTemperaturaMin(Double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	public Double getTemperaturaMax() {
		return temperaturaMax;
	}
	public void setTemperaturaMax(Double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	public Integer getHumidadeRelativa() {
		return humidadeRelativa;
	}
	public void setHumidadeRelativa(Integer humidadeRelativa) {
		this.humidadeRelativa = humidadeRelativa;
	}
	private Integer humidadeRelativa;
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataHora;
	
	@OneToOne (optional = false)
	@JoinColumn (name = "id_dia_da_semana")
	private DiaDaSemana diaDaSemana;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_cidade")
	private Cidade cidade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public DiaDaSemana getDiaDaSemana() {
		return diaDaSemana;
	}
	public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
		public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
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
		PrevisaoTempo other = (PrevisaoTempo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PrevisaoTempo [id=" + id + ", descricao=" + descricao + ", temperaturaMin=" + temperaturaMin + ", temperaturaMax=" + temperaturaMax
				+ ", humidade=" + humidadeRelativa + ", dataHora=" + dataHora + ", diaDaSemana=" + diaDaSemana + ", cidade="
				+ cidade + "]";
	}
	
	
	

}
