package br.com.setebit.ieadam.api.repository;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Nucleo;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.entity.Zona;

public interface NucleoRepositorioSql {

	public List<Nucleo> listaNucleoUsuario(Usuario usuario);

	public List<Nucleo> listaNucleoPorArea(Usuario usuario);

	public List<Nucleo> listaNucleoToUsuarioAndZona(Usuario usuario, Zona zona);

	public boolean isUsuarioDeNucleo(int usuarioId, int idNucleo);

}