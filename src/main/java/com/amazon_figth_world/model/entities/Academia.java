package com.amazon_figth_world.model.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_academia")
public class Academia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeAcademia;
	private String descricao;
	private String telefone;
	private String emailContato;
	private String instagram;
	private String urlLogo;

	@Embedded
	private Endereco enderecoAcademia;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Usuario> usuarioAluno = new ArrayList<>();

	@OneToMany
	@JoinColumn(name = "professor_id")
	private List<Usuario> usarioProfessoor = new ArrayList<>();

	private boolean ativa = true;

	public Academia(Long id, String nomeAcademia, String descricao, String telefone, String emailContato,
			String instagram, String urlLogo, Endereco enderecoAcademia, List<Usuario> usuarioAluno,
			List<Usuario> usarioProfessoor, boolean ativa) {
		this.id = id;
		this.nomeAcademia = nomeAcademia;
		this.descricao = descricao;
		this.telefone = telefone;
		this.emailContato = emailContato;
		this.instagram = instagram;
		this.urlLogo = urlLogo;
		this.enderecoAcademia = enderecoAcademia;
		this.usuarioAluno = usuarioAluno;
		this.usarioProfessoor = usarioProfessoor;
		this.ativa = ativa;
	}

	public Academia() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAcademia() {
		return nomeAcademia;
	}

	public void setNomeAcademia(String nomeAcademia) {
		this.nomeAcademia = nomeAcademia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getUrlLogo() {
		return urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}

	public Endereco getEnderecoAcademia() {
		return enderecoAcademia;
	}

	public void setEnderecoAcademia(Endereco enderecoAcademia) {
		this.enderecoAcademia = enderecoAcademia;
	}

	public List<Usuario> getUsuarioAluno() {
		return usuarioAluno;
	}

	public void setUsuarioAluno(List<Usuario> usuarioAluno) {
		this.usuarioAluno = usuarioAluno;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

}
