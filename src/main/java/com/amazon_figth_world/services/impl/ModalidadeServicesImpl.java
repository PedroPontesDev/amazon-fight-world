package com.amazon_figth_world.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazon_figth_world.model.entities.Modalidade;
import com.amazon_figth_world.repositories.ModalidadeRepository;
import com.amazon_figth_world.services.ModalidadeService;

public class ModalidadeServicesImpl implements ModalidadeService {

	@Autowired
	private ModalidadeRepository modalidadeRepository;
	
	@Override
	public Modalidade criarModalidade(Modalidade novaModalidade) {
		Modalidade modalidade = new Modalidade();
		modalidade.setAtiva(true);
		modalidade.setNomeExibicao(novaModalidade.getNomeExibicao());
		
		return null;
	}

	@Override
	public Modalidade findModalidadeAtivaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Modalidade findModalidadePorSlug(String slug) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Modalidade> listarModalidadesAtivas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Modalidade> listarModalidadesDesativadas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void desativarModalidadePorId(Long id) {
		// TODO Auto-generated method stub
		
	}


}
