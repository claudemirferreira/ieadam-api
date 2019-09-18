package br.com.setebit.ieadam.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.setebit.ieadam.api.security.entity.Perfil;

@Repository
public class PerfilRepositorioSqlImpl implements PerfilRepositorioSql {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Perfil> listaPerfilPorSistemaPorUsuario(int sistemaId,
			int usuarioId) {
		return entityManager.createNativeQuery(
				"SELECT distinct i.* FROM saa_perfil i, saa_usuario_perfil b "
						+ "where i.id_perfil = b.id_perfil and i.id_sistema = "
						+ sistemaId + " and b.id_usuario =  " + usuarioId,
				Perfil.class).getResultList();
	}
}