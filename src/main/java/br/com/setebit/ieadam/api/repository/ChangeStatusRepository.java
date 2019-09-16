package br.com.setebit.ieadam.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.ieadam.api.security.entity.ChangeStatus;

public interface ChangeStatusRepository extends JpaRepository<ChangeStatus, Long> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(Long ticketId);
}
