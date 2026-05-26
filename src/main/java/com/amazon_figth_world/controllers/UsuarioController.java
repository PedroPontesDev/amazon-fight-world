package com.amazon_figth_world.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon_figth_world.model.dto.v1.UsuarioDTO;
import com.amazon_figth_world.model.entities.Usuario;
import com.amazon_figth_world.services.impl.UsuarioServicesImpl;

@RestController
@RequestMapping(path = "/v1/api/")
public class UsuarioController {
	
	@Autowired
	private UsuarioServicesImpl serviceUser;
	
	@PostMapping("/cadastar-usuario")
	public ResponseEntity<UsuarioDTO> criarUsuario(UsuarioDTO novoUsuario) {
		UsuarioDTO usarioNovo = serviceUser.cadastrarUsuario(novoUsuario);
		return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
	}

}
