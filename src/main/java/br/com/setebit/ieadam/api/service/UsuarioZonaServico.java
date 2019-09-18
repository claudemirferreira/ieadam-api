package br.com.setebit.ieadam.api.service;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.entity.UsuarioZona;
import br.com.setebit.ieadam.api.security.entity.Zona;

public interface UsuarioZonaServico {

	public List<UsuarioZona> listarTodos();

	public UsuarioZona salvar(UsuarioZona usuarioZona);

	public void remover(UsuarioZona usuarioZona);

	public void deleteByUsuarioAndByZona(Usuario usuario, Zona zona);

	public UsuarioZona findByUsuarioAndByZona(Usuario usuario, Zona zona);

	public List<Zona> findByUsuario(Usuario usuario);
}