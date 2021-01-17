package com.tiquete.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiquete.domain.dto.Ticket;
import com.tiquete.domain.dto.TicketID;
import com.tiquete.domain.repository.TicketRepository;
import com.tiquete.domain.validation.TiqueteValidation;

@Service
public class TiqueteService {
	
	@Autowired
	private TicketRepository tikectReporsitory;
	
	@Autowired
	private TiqueteValidation tiqueteValidation;
	
	public Optional<Ticket> getTiquete(int id){
		return tikectReporsitory.getTiquete(id);
	}
	
	public TicketID save(Ticket tiquete) {
		
		TicketID ticketID = new TicketID();
		
		boolean valida = tiqueteValidation.validacionesTiquetes(tiquete);
		
		if(valida){
			ticketID = tikectReporsitory.save(tiquete);
	    }else {
	    	ticketID = null;
	    }
		
		return ticketID;
	}
	
	public List<Ticket> getAll(){
		return tikectReporsitory.getAll();
	}
}
