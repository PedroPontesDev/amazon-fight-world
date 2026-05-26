package com.amazon_figth_world.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_modalidade")
public class Modalidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, nullable = false)
	private String slug; // ex: mma - box - jj

	@Column(nullable = false)
	private String nomeExibicao; // nome que sera exposto no banco e no frontend

	private boolean ativa = true;

	@OneToMany(mappedBy = "modalidade")
	private List<CategoriaPeso> categorias = new ArrayList<>();
	

	@OneToMany(mappedBy = "modalidade")
	private List<Evento> evento = new ArrayList<>();


	public Modalidade(Long id, String slug, String nomeExibicao, boolean ativa, List<CategoriaPeso> categorias) {
		this.id = id;
		this.slug = slug;
		this.nomeExibicao = nomeExibicao;
		this.ativa = ativa;
		this.categorias = categorias;
	}

	public Modalidade() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getNomeExibicao() {
		return nomeExibicao;
	}

	public void setNomeExibicao(String nomeExibicao) {
		this.nomeExibicao = nomeExibicao;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public List<CategoriaPeso> getCategorias() {
		return categorias;
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
		Modalidade other = (Modalidade) obj;
		return Objects.equals(id, other.id);
	}

}
