package com.tiquete.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tiquete.domain.dto.Tikect;
import com.tiquete.domain.repository.TikectRepository;
import com.tiquete.persistence.crud.TiqueteCrudRepository;
import com.tiquete.persistence.entity.Tiquete;
import com.tiquete.persistence.mapper.TiqueteMapper;

@Repository
public class TiqueteRepository implements TikectRepository {
	
	@Autowired
	private TiqueteCrudRepository tiqueteCrudReporsitory;
	
	@Autowired
	private TiqueteMapper mapper;
	
	@Override
	public Tikect save(Tikect tiquete) {
		
		Tiquete tiquet = mapper.toTiquete(tiquete);
		
		return mapper.toTiquete(tiqueteCrudReporsitory.save(tiquet));
	}
	
	@Override
	public Optional<Tikect> getTiquete(int id){
		return  tiqueteCrudReporsitory.findById(id).map(tiquete -> mapper.toTiquete(tiquete));
	}
	
	@Override
	public List<Tikect> getAll() {
		
		List<Tiquete> tiquetes = (List<Tiquete>) tiqueteCrudReporsitory.findAll();
		
		return mapper.toTiquetes(tiquetes);
	}

}
