package com.amazon_figth_world.model.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_evento")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome_evento", length = 100, nullable = false, unique = true)
	private String nomeEvento;

	@Lob
	private String descricaoEvento;
	
	@Column
	private String urlImagem;

	@DateTimeFormat(iso = ISO.DATE_TIME, pattern = "yyyy/MM/dd hh:mm:ss")
	private LocalDateTime inicioEvento;

	@DateTimeFormat(iso = ISO.DATE_TIME, pattern = "yyyy/MM/dd hh:mm:ss")
	private LocalDateTime terminoEvento;

	@ManyToOne
	private Modalidade modalidade;
	
	private String cep;
	
	private Double valorInscricao;
	
	private Integer limiteParticipantes;
	
	private boolean ativo = false;
	
	@OneToMany(mappedBy = "evento")
	private List<InscricaoEvento> inscricao = new ArrayList<>();
	
	public Evento(Long id, String nomeEvento, String descricaoEvento, String urlImagem, LocalDateTime inicioEvento,
			LocalDateTime terminoEvento, Modalidade modalidade, String cep, Double valorInscricao,
			Integer limiteParticipantes, boolean ativo) {
		this.id = id;
		this.nomeEvento = nomeEvento;
		this.descricaoEvento = descricaoEvento;
		this.urlImagem = urlImagem;
		this.inicioEvento = inicioEvento;
		this.terminoEvento = terminoEvento;
		this.modalidade = modalidade;
		this.cep = cep;
		this.valorInscricao = valorInscricao;
		this.limiteParticipantes = limiteParticipantes;
		this.ativo = ativo;
	}

	public Evento() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getDescricaoEvento() {
		return descricaoEvento;
	}

	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public LocalDateTime getInicioEvento() {
		return inicioEvento;
	}

	public void setInicioEvento(LocalDateTime inicioEvento) {
		this.inicioEvento = inicioEvento;
	}

	public LocalDateTime getTerminoEvento() {
		return terminoEvento;
	}

	public void setTerminoEvento(LocalDateTime terminoEvento) {
		this.terminoEvento = terminoEvento;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Double getValorInscricao() {
		return valorInscricao;
	}

	public void setValorInscricao(Double valorInscricao) {
		this.valorInscricao = valorInscricao;
	}

	public Integer getLimiteParticipantes() {
		return limiteParticipantes;
	}

	public void setLimiteParticipantes(Integer limiteParticipantes) {
		this.limiteParticipantes = limiteParticipantes;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(id, other.id);
	}
	
}
