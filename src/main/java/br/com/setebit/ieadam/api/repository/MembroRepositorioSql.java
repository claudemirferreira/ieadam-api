package br.com.setebit.ieadam.api.repository;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.ViewMembro;

public interface MembroRepositorioSql {

	public List<ViewMembro> listarMembrosByFiltros(ViewMembro viewMembro);

}