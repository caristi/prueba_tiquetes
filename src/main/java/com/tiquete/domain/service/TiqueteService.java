package com.tiquete.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiquete.domain.dto.Ticket;
import com.tiquete.domain.repository.TicketRepository;
import com.tiquete.domain.validation.TiqueteValidation;

@Service
public class TiqueteService {
	
	@Autowired
	private TicketRepository tikectReporsitory;
	
	@Autowired
	private TiqueteValidation tiqueteValidation;
	
	public List<Ticket> getAll(){
		return tikectReporsitory.getAll();
	}
	
	public Optional<Ticket> getTiquete(int id){
		return tikectReporsitory.getTiquete(id);
	}
	
	public Ticket save(Ticket tiquete) {
		
		boolean valida = tiqueteValidation.validaFechasTiqueta(tiquete.getFechaSalida(), tiquete.getFechaLlegada());
		
		if(valida){
			tiquete = tikectReporsitory.save(tiquete);
	    }else {
	    	tiquete = null;
	    }
		
		return tiquete;
	}
}
