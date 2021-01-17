package com.tiquete.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiquete.domain.dto.Ticket;
import com.tiquete.domain.dto.TicketID;
import com.tiquete.domain.service.TiqueteService;

@RestController
@RequestMapping("/tiquetes")
public class TicketController {

	@Autowired
	private TiqueteService tiqueteService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Ticket> getTiquete(@PathVariable("id") int id){
		
		return tiqueteService.getTiquete(id)
				.map(ticket -> new ResponseEntity<>(ticket,HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/save")
	public ResponseEntity<TicketID> save(@RequestBody Ticket tiquete){
		
		TicketID ticketID = tiqueteService.save(tiquete);
		
		if(ticketID != null) {
			return new ResponseEntity<>(ticketID,HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Ticket>> getAll(){
		return new ResponseEntity<>(tiqueteService.getAll(),HttpStatus.OK);
	}
}
