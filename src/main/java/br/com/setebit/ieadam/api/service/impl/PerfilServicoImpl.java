package br.com.setebit.ieadam.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.setebit.ieadam.api.repository.PerfilRepositorio;
import br.com.setebit.ieadam.api.repository.PerfilRepositorioSql;
import br.com.setebit.ieadam.api.security.entity.Perfil;
import br.com.setebit.ieadam.api.service.PerfilServico;

@Service
public class PerfilServicoImpl implements PerfilServico {

	@Autowired
	private PerfilRepositorio perfilRepositorio;

	@Autowired
	private PerfilRepositorioSql perfilRepositorioSql;

	@Override
	public List<Perfil> listarTodos() {
		return this.perfilRepositorio.findAll();
	}

	@Override
	public Perfil salvar(Perfil perfil) {
		return this.perfilRepositorio.save(perfil);
	}

	@Override
	public void remover(Perfil perfil) {
		this.perfilRepositorio.delete(perfil);
	}

	@Override
	public List<Perfil> findByNomeLike(String nome) {
		return this.perfilRepositorio.findByNomeLike(nome);
	}

	@Override
	public List<Perfil> listaPerfilPorSistemaPorUsuario(int sistemaId, int usuarioId) {
		return this.perfilRepositorioSql.listaPerfilPorSistemaPorUsuario(sistemaId, usuarioId);
	}
}