package br.com.setebit.ieadam.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.setebit.ieadam.api.repository.PerfilRotinaRepositorio;
import br.com.setebit.ieadam.api.repository.PerfilRotinaRepositorioSql;
import br.com.setebit.ieadam.api.security.entity.PerfilRotina;
import br.com.setebit.ieadam.api.security.entity.Rotina;
import br.com.setebit.ieadam.api.service.PerfilRotinaServico;

@Service
public class PerfilRotinaServicoImpl implements PerfilRotinaServico {

	@Autowired
	private PerfilRotinaRepositorio repositorio;

	@Autowired
	private PerfilRotinaRepositorioSql repositorioSql;

	@Override
	public List<PerfilRotina> listarTodos() {
		return repositorio.findAll();
	}

	@Override
	public PerfilRotina salvar(PerfilRotina perfilRotina) {
		return repositorio.save(perfilRotina);
	}

	@Override
	public void remover(PerfilRotina perfilRotina) {
		this.repositorio.delete(perfilRotina);
	}

	public List<Rotina> listaRotinaNotInPerfil(int idPerfil) {
		return repositorioSql.listaRotinaNotInPerfil(idPerfil);
	}

}
