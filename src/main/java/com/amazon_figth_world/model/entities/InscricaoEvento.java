package com.amazon_figth_world.model.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.amazon_figth_world.model.enums.SituacaoInscricao;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_inscricao_evento")
public class InscricaoEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Instant criadaEm = Instant.now();

	@Enumerated(EnumType.STRING)
	private SituacaoInscricao situacao = SituacaoInscricao.PENDENTE;

	@ManyToOne
	@JoinColumn
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "evento_id")
	private Evento evento;

	@ManyToOne
	@JoinColumn(name = "categoria_peso_id")
	private CategoriaPeso categoriaPeso;

	public InscricaoEvento(Long id, Instant criadaEm, SituacaoInscricao situacao, Usuario usuario, Evento evento,
			CategoriaPeso categoriaPeso) {
		this.id = id;
		this.criadaEm = criadaEm;
		this.situacao = situacao;
		this.usuario = usuario;
		this.evento = evento;
		this.categoriaPeso = categoriaPeso;
	}

	public InscricaoEvento() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getCriadaEm() {
		return criadaEm;
	}

	public void setCriadaEm(Instant criadaEm) {
		this.criadaEm = criadaEm;
	}

	public SituacaoInscricao getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoInscricao situacao) {
		this.situacao = situacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public CategoriaPeso getCategoriaPeso() {
		return categoriaPeso;
	}

	public void setCategoriaPeso(CategoriaPeso categoriaPeso) {
		this.categoriaPeso = categoriaPeso;
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
		InscricaoEvento other = (InscricaoEvento) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
