package com.tiquete.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiquete.domain.dto.Tikect;
import com.tiquete.domain.repository.TikectRepository;

@Service
public class TiqueteService {
	
	@Autowired
	private TikectRepository tikectReporsitory;
	
	public List<Tikect> getAll(){
		return tikectReporsitory.getAll();
	}
	
	public Optional<Tikect> getTiquete(int id){
		return tikectReporsitory.getTiquete(id);
	}
	
	public Tikect save(Tikect tiquete) {
		return tikectReporsitory.save(tiquete);
	}

}
