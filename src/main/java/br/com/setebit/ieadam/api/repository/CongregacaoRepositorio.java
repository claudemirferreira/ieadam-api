package br.com.setebit.ieadam.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.setebit.ieadam.api.security.entity.Area;
import br.com.setebit.ieadam.api.security.entity.Congregacao;

public interface CongregacaoRepositorio extends
		JpaRepository<Congregacao, Integer> {

	@Query("select a from Congregacao a where a.area = :area")
	public List<Congregacao> findByArea(@Param("area") Area area);

}