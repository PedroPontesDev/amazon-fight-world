package com.amazon_figth_world.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon_figth_world.model.entities.CategoriaPeso;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaPeso, Long> {

	
	

}
