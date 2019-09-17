package br.com.setebit.ieadam.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.setebit.ieadam.api.security.entity.PerfilRotina;

@Repository
public interface PerfilRotinaRepositorio extends JpaRepository<PerfilRotina, Long> {

}