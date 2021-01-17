package com.tiquete.domain.validation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import com.tiquete.domain.dto.Ticket;

@Component
public class TiqueteValidation {
	
	public boolean validacionesTiquetes(Ticket tiquete) {
		
		if(!validaFechasTiqueta(tiquete.getFechaSalida(), tiquete.getFechaLlegada())){
			return false;
		}else if(!validaPrecio(tiquete.getPrecio())){
			return false;
		}

		return true;
	}
	
	public boolean validaFechasTiqueta(String fechaSalida, String fechaLlegada) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		LocalDateTime fecSalida =  LocalDateTime.parse(fechaSalida,formatter);
		
		LocalDateTime fecLLegada =  LocalDateTime.parse(fechaLlegada,formatter);

		return fecSalida.isBefore(fecLLegada);
	}
	
	public boolean validaPrecio(Double precio) {
		
		if(precio < new Double(0)) {
			return false;
		}
		
		return true;
	}

}
