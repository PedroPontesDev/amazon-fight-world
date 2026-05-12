package com.amazon_figth_world.services;

import java.util.List;

import com.amazon_figth_world.model.dto.v1.UsuarioDTO;

public interface UsuarioService {

	UsuarioDTO cadastrarUsuario(UsuarioDTO novoUsuario);

	UsuarioDTO atualizarUsuario(Long userId, UsuarioDTO novoUsuario);

	List<UsuarioDTO> listarUsuarios();

	void deletarUsuarioPorId(Long userId);

}
