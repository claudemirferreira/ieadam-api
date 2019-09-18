package br.com.setebit.ieadam.api.repository;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Zona;

public interface ZonaRepositorioSql {

	public List<Zona> listaZonaUsuario(int usuarioId);

	public boolean isUsuarioDeZona(int usuarioId, int idZona);

}