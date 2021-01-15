package com.tiquete.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tiquete.domain.dto.Ticket;
import com.tiquete.domain.repository.TicketRepository;
import com.tiquete.persistence.crud.TiqueteCrudRepository;
import com.tiquete.persistence.entity.Tiquete;
import com.tiquete.persistence.mapper.TiqueteMapper;

@Repository
public class TiqueteRepository implements TicketRepository {
	
	@Autowired
	private TiqueteCrudRepository tiqueteCrudReporsitory;
	
	@Autowired
	private TiqueteMapper mapper;
	
	@Override
	public Ticket save(Ticket tiquete) {
		
		Tiquete tiquet = mapper.toTiquete(tiquete);
		
		return mapper.toTiquete(tiqueteCrudReporsitory.save(tiquet));
	}
	
	@Override
	public Optional<Ticket> getTiquete(int id){
		return  tiqueteCrudReporsitory.findById(id).map(tiquete -> mapper.toTiquete(tiquete));
	}
	
	@Override
	public List<Ticket> getAll() {
		
		List<Tiquete> tiquetes = (List<Tiquete>) tiqueteCrudReporsitory.findAll();
		
		return mapper.toTiquetes(tiquetes);
	}

}
