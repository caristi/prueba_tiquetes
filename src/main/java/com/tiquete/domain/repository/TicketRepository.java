package com.tiquete.domain.repository;

import java.util.List;
import java.util.Optional;

import com.tiquete.domain.dto.Ticket;

public interface TicketRepository {
	
	public Ticket save(Ticket tiquete);
	
	public Optional<Ticket> getTiquete(int id);
	
	public List<Ticket> getAll();
	
}
