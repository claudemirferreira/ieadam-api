package br.com.setebit.ieadam.api.repository;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Perfil;

public interface UsuarioPerfilRepositorioSql {

	public List<Perfil> listaPerfilNotInUsuario(int idUsuario);

}