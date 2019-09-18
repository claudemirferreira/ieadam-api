package br.com.setebit.ieadam.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.setebit.ieadam.api.repository.UsuarioNucleoRepositorio;
import br.com.setebit.ieadam.api.security.entity.Nucleo;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.entity.UsuarioNucleo;
import br.com.setebit.ieadam.api.service.UsuarioNucleoServico;

@Service
public class UsuarioNucleoServicoImpl implements UsuarioNucleoServico {

	@Autowired
	private UsuarioNucleoRepositorio repositorio;

	@Override
	public List<UsuarioNucleo> listarTodos() {
		return repositorio.findAll();
	}

	@Override
	public UsuarioNucleo salvar(UsuarioNucleo usuarioNucleo) {
		return repositorio.saveAndFlush(usuarioNucleo);
	}

	@Override
	public void remover(UsuarioNucleo usuarioNucleo) {
		repositorio.delete(usuarioNucleo);
	}

	@Override
	public UsuarioNucleo findByUsuarioAndByNucleo(Usuario usuario, Nucleo nucleo) {
		return repositorio.findByUsuarioAndByNucleo(usuario, nucleo);
	}

	@Override
	public void deleteByUsuarioAndByNucleo(Usuario usuario, Nucleo nucleo) {
		repositorio.deleteByUsuarioAndByNucleo(usuario, nucleo);

	}

	@Override
	public List<Nucleo> findByUsuario(Usuario usuario) {

		List<UsuarioNucleo> lista = repositorio.findByUsuario(usuario);
		List<Nucleo> nucleos = new ArrayList<Nucleo>();

		for (UsuarioNucleo usuarioNucleo : lista) {
			nucleos.add(usuarioNucleo.getNucleo());
		}

		return nucleos;
	}
}