package com.pluralsight.conferencedemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.TicketType;

public interface TicketTypeJpaRepository extends JpaRepository<TicketType, String>{

	List<TicketType> findByIncludesWorkshopTrue();
	
}
