package com.amazon_figth_world.model.dto.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nomeCompleto;

	private String cpf;

	private String email;

	private String username;

	private boolean ativo;

	private Long academiaId;

	private String nomeAcademia;

	private List<Long> inscricoesIds = new ArrayList<>();

	public UsuarioDTO() {

	}

	public UsuarioDTO(Long id, String nomeCompleto, String cpf, String email, String username,
			boolean ativo, Long academiaId, String nomeAcademia, List<Long> inscricoesIds) {

		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.email = email;
		this.username = username;
		this.ativo = ativo;
		this.academiaId = academiaId;
		this.nomeAcademia = nomeAcademia;
		this.inscricoesIds = inscricoesIds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getAcademiaId() {
		return academiaId;
	}

	public void setAcademiaId(Long academiaId) {
		this.academiaId = academiaId;
	}

	public String getNomeAcademia() {
		return nomeAcademia;
	}

	public void setNomeAcademia(String nomeAcademia) {
		this.nomeAcademia = nomeAcademia;
	}

	public List<Long> getInscricoesIds() {
		return inscricoesIds;
	}

	public void setInscricoesIds(List<Long> inscricoesIds) {
		this.inscricoesIds = inscricoesIds;
	}
}