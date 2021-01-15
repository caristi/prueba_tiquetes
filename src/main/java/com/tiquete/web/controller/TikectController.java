package com.tiquete.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiquete.domain.dto.Tikect;
import com.tiquete.domain.service.TiqueteService;

@RestController
@RequestMapping("/tiquetes")
public class TikectController {

	@Autowired
	private TiqueteService tiqueteService;
	
	@GetMapping("/{id}")
	public Optional<Tikect> getTiquete(@PathVariable("id") int id){
		
		return tiqueteService.getTiquete(id);
	}
	
	@PostMapping("/save")
	public Tikect save(@RequestBody Tikect tiquete){
		return tiqueteService.save(tiquete);
	}
	
	@GetMapping("/all")
	public List<Tikect> getAll(){
		return tiqueteService.getAll();
	}
}
