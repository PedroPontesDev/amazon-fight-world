package com.amazon_figth_world.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon_figth_world.model.entities.Modalidade;

@Repository
public interface ModalidadeRepository extends JpaRepository<Modalidade, Long> {
	
	/*	
	 Modalidade findModalidadeAtivaPorId(Long id);
	 
	 Modalidade findModalidadePorSlug(String slug);
	 
	 List<Modalidade> listarModalidadesAtivas();
	 
	 List<Modalidade> listarModalidadesDesativadas();
	
	 void desativarModalidadePorId(Long id); */

}
