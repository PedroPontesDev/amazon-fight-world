package com.amazon_figth_world.services.impl;

import java.util.List;

import com.amazon_figth_world.model.dto.v1.UsuarioDTO;
import com.amazon_figth_world.model.entities.Usuario;
import com.amazon_figth_world.services.UsuarioService;

public class ModalidadeServicesImpl implements UsuarioService {

	@Override
	public UsuarioDTO cadastrarUsuario(UsuarioDTO novoUsuario) {
		Usuario user = new Usuario();
		
		if(user.getPassword().length() < 8) {
			if(user.getPassword().contains(null)) {
				
			}
			
		}
		
		return null;
		
	}

	@Override
	public UsuarioDTO atualizarUsuario(Long userId, UsuarioDTO novoUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioDTO> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletarUsuarioPorId(Long userId) {
		// TODO Auto-generated method stub
		
	}

}
