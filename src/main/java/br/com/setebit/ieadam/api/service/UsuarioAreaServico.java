package br.com.setebit.ieadam.api.service;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Area;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.entity.UsuarioArea;

public interface UsuarioAreaServico {

	public List<UsuarioArea> listarTodos();

	public UsuarioArea salvar(UsuarioArea usuarioArea);

	public void remover(UsuarioArea usuarioArea);

	public void deleteByUsuarioAndByArea(Usuario usuario, Area area);

	public UsuarioArea findByUsuarioAndByArea(Usuario usuario, Area area);

	public List<Area> findByUsuario(Usuario usuario);
}