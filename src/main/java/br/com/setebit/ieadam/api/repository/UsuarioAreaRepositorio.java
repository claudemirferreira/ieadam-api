package br.com.setebit.ieadam.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.setebit.ieadam.api.security.entity.Area;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.entity.UsuarioArea;

public interface UsuarioAreaRepositorio extends JpaRepository<UsuarioArea, Long> {

	@Query("select a from UsuarioArea a where a.usuario = :usuario and  a.area = :area order by a.area.nome")
	public UsuarioArea findByUsuarioAndByArea(@Param("usuario") Usuario usuario, @Param("area") Area area);

	@Modifying
	@Transactional
	@Query("delete from UsuarioArea a where a.usuario = :usuario and  a.area = :area")
	void deleteByUsuarioAndByArea(@Param("usuario") Usuario usuario, @Param("area") Area area);

	@Query("select a from UsuarioArea a where a.usuario = :usuario")
	List<UsuarioArea> findByUsuario(@Param("usuario") Usuario usuario);

}