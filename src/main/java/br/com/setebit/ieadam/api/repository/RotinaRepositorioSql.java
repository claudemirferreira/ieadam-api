package br.com.setebit.ieadam.api.repository;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Rotina;

public interface RotinaRepositorioSql {

	public List<Rotina> listaRotinasPorPerfil(int id);

}
