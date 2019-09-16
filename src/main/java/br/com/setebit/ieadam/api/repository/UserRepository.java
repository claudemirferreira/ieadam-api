package br.com.setebit.ieadam.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.ieadam.api.security.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}