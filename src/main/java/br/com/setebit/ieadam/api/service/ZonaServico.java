package br.com.setebit.ieadam.api.service;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Zona;

public interface ZonaServico {

	public List<Zona> listarTodos();

	List<Zona> listarTodosPorSituacao(String situacao);
	
	public Zona salvar(Zona zona);

	public void remover(Zona zona);

	public List<Zona> findByMembro(int membro);
	
	public Zona findOne(int id);
	
	public List<Zona> listaZonaUsuario(int usuarioId);
	
	public boolean isUsuarioDeZona(int usuarioId, int idZona);

}