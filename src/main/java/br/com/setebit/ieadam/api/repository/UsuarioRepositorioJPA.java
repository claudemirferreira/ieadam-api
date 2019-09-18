package br.com.setebit.ieadam.api.repository;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Usuario;

public interface UsuarioRepositorioJPA {

	List<Usuario> findByUsuario(Usuario usuario);

}