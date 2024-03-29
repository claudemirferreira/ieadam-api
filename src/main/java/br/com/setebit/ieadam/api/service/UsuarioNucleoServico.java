package br.com.setebit.ieadam.api.service;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Nucleo;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.entity.UsuarioNucleo;

public interface UsuarioNucleoServico {

	public List<UsuarioNucleo> listarTodos();

	public UsuarioNucleo salvar(UsuarioNucleo usuarioNucleo);

	public void remover(UsuarioNucleo usuarioNucleo);

	public void deleteByUsuarioAndByNucleo(Usuario usuario, Nucleo nucleo);

	public UsuarioNucleo findByUsuarioAndByNucleo(Usuario usuario, Nucleo nucleo);

	public List<Nucleo> findByUsuario(Usuario usuario);
}