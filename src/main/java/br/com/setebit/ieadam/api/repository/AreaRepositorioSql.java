package br.com.setebit.ieadam.api.repository;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Area;
import br.com.setebit.ieadam.api.security.entity.Nucleo;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.entity.Zona;

public interface AreaRepositorioSql {

	public List<Area> listaAreaToUsuarioAndNucleo(Usuario usuario, Nucleo nucleo);

	public List<Area> listaAreaToZona(Zona zona);

}