package br.com.setebit.ieadam.api.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import br.com.setebit.ieadam.api.security.entity.Membro;
import br.com.setebit.ieadam.api.security.entity.ViewMembro;

public interface MembroServico {

	public List<Membro> listarTodos();

	public Membro salvar(Membro membro);

	public void remover(Membro membro);

	public List<Membro> listarMembrosPorNomeLike(@Param("nome") String nome);

	public List<ViewMembro> listarMembrosByFiltros(ViewMembro viewMembro);

}