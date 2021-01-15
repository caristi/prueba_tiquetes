package com.tiquete.domain.repository;

import java.util.List;
import java.util.Optional;

import com.tiquete.domain.dto.Tikect;

public interface TikectRepository {
	
	public Tikect save(Tikect tiquete);
	
	public Optional<Tikect> getTiquete(int id);
	
	public List<Tikect> getAll();
	
}
