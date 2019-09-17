package br.com.setebit.ieadam.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.setebit.ieadam.api.repository.MembroRepositorio;
import br.com.setebit.ieadam.api.repository.MembroRepositorioSql;
import br.com.setebit.ieadam.api.security.entity.Membro;
import br.com.setebit.ieadam.api.security.entity.ViewMembro;
import br.com.setebit.ieadam.api.service.MembroServico;

@Service
public class MembroServicoImpl implements MembroServico {

	@Autowired
	private MembroRepositorio membroRepositorio;

	@Autowired
	private MembroRepositorioSql repositorioSql;

	@Override
	public List<Membro> listarTodos() {
		return membroRepositorio.findAll();
	}

	@Override
	public Membro salvar(Membro membro) {
		return membroRepositorio.save(membro);
	}

	@Override
	public void remover(Membro membro) {
		membroRepositorio.delete(membro);
	}

	@Override
	public List<Membro> listarMembrosPorNomeLike(String nome) {
		return this.membroRepositorio.listarMembrosPorNomeLike(nome);
	}

	@Override
	public List<ViewMembro> listarMembrosByFiltros(ViewMembro viewmembro) {
		return this.repositorioSql.listarMembrosByFiltros(viewmembro);
	}
}
