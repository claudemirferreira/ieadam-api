package br.com.setebit.ieadam.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.setebit.ieadam.api.security.entity.Area;
import br.com.setebit.ieadam.api.security.entity.Nucleo;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.entity.Zona;

@Repository
public class AreaRepositorioSqlImpl implements AreaRepositorioSql {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Area> listaAreaToUsuarioAndNucleo(Usuario usuario, Nucleo nucleo) {

		String SQL = "select b.* from ieadam_area b, ieadam_usuario_area c " + " where b.id_area = c.id_area "
				+ " and b.id_nucleo = " + nucleo.getIdNucleo() + " and c.id_usuario = " + usuario.getIdUsuario();
		return entityManager.createNativeQuery(SQL, Area.class).getResultList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Area> listaAreaToZona(Zona zona) {

		String SQL = "select a.* from sgr.ieadam_area a, sgr.ieadam_nucleo b, sgr.ieadam_zona c "
				+ "where a.id_nucleo = b.id_nucleo and b.id_zona = c.id_zona " + "and c.id_zona =" + zona.getIdZona();

		return entityManager.createNativeQuery(SQL, Area.class).getResultList();
	}
}