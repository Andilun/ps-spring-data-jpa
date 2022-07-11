package com.pluralsight.conferencedemo.models;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pluralsight.conferencedemo.repositories.TicketTypeJpaRepository;

@SpringBootTest
public class TicketTypeTest {
	
	@Autowired
	private TicketTypeJpaRepository ticketTypeJpaRepository;
	
	@Test
	public void testJpaTrue() throws Exception {
		List<TicketType> types = ticketTypeJpaRepository.findByIncludesWorkshopTrue();
		assertTrue(types.size()>0);
	}
	
	

}
