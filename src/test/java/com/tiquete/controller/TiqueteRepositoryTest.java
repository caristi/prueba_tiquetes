package com.tiquete.controller;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.tiquete.domain.dto.Ticket;
import com.tiquete.persistence.TiqueteRepository;

@SpringBootTest
public class TiqueteRepositoryTest {
	
	@InjectMocks
	private TiqueteRepository ticketRepository;
	
	
	@Test
	public void comprobarRetornoDeTiqueteDelServicio() {
		
		Integer id = 0;
		
		Optional<Ticket> tiquete = ticketRepository.getTiquete(id);
		
	}

}
