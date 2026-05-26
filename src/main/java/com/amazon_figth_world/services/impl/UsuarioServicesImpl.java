package com.amazon_figth_world.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon_figth_world.model.dto.v1.UsuarioDTO;
import com.amazon_figth_world.model.entities.Usuario;
import com.amazon_figth_world.model.mapper.MyMapper;
import com.amazon_figth_world.repositories.UsuarioRepository;
import com.amazon_figth_world.services.UsuarioService;

@Service
public class UsuarioServicesImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository userRepository; 
	
	@Override
	public UsuarioDTO cadastrarUsuario(UsuarioDTO novoUsuario) {
		Usuario user = new Usuario();
		
		if(!user.getPassword().matches(".*\\d.*")) {
		    throw new RuntimeException("Senha deve conter número");
		}
		
		if(user.getPassword().length() < 8) {
			throw new RuntimeException("A senha deve conter pelo menos 8 digitos");
		}
		if(user.getPassword().matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
			throw new RuntimeException("A senha deve conter pelo algum caracter especial");
		}
		
		userRepository.save(user);
		
		return MyMapper.parseObject(user, UsuarioDTO.class);
		
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
