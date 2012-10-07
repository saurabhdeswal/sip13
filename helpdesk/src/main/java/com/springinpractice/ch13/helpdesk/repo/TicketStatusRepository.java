package com.springinpractice.ch13.helpdesk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springinpractice.ch13.helpdesk.model.TicketStatus;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface TicketStatusRepository extends JpaRepository<TicketStatus, Long> {
	
	TicketStatus findByKey(String key);
}