package br.com.setebit.ieadam.api.service;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Perfil;

public interface PerfilServico {

	public List<Perfil> listarTodos();

	public Perfil salvar(Perfil perfil);

	public void remover(Perfil perfil);

	public List<Perfil> findByNomeLike(String nome);

	public List<Perfil> listaPerfilPorSistemaPorUsuario(int sistemaId, int usuarioId);

}