package com.amazon_figth_world.services;

import java.util.List;

import com.amazon_figth_world.model.entities.Modalidade;


public interface ModalidadeService {

	 Modalidade criarModalidade(Modalidade novaModalidade);
	
	 Modalidade findModalidadeAtivaPorId(Long id);
	 
	 Modalidade findModalidadePorSlug(String slug);
	 
	 List<Modalidade> listarModalidadesAtivas();
	 
	 List<Modalidade> listarModalidadesDesativadas();
	
	 void desativarModalidadePorId(Long id);
	 
	 
}
