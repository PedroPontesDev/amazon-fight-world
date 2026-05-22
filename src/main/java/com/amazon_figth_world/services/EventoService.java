package com.amazon_figth_world.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.amazon_figth_world.model.entities.Evento;

public interface EventoService {

	Evento criarEvento(Evento evento, Long modalidadeId);

	Evento atualizarEvento(Long eventoId, Evento update);

	Evento deletarEvento(Long eventoId);

	Evento buscarPorId(Long eventoId);
	
	boolean eventoAtingiuLimiteParticipantes(Long eventoId, Integer numeroMaximo);

	Integer calcularVagasDisponiveis(Long eventoId);

	List<Evento> listarEventosAtivos();

	List<Evento> visualizarEventosMaisProximos();
	
	String uploadFotoEvento(Long eventoId, MultipartFile arquivo);

}
