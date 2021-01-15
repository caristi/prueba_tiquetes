package com.tiquete.domain.validation;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TiqueteValidation {
	
	public boolean validaFechasTiqueta(Date fechaSalida, Date fechaLlegada) {
		
		LocalDateTime fecSalida =  fechaSalida.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		
		LocalDateTime fecLLegada =  fechaLlegada.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

		return fecSalida.isBefore(fecLLegada);
	}

}
