package com.tiquete.validation;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tiquete.domain.validation.TiqueteValidation;

@SpringBootTest
public class TiqueteValidationTests {
	
	@Autowired
	private TiqueteValidation tiqueteValidation;
	
	@Test
	public void validaFechaSalidaMenorAFechaSalidaLlegada() {
		
		Date fechaSalida  = new Date();
		Date fechaLlegada = new Date();
		
		Calendar c = Calendar.getInstance();
        c.setTime(fechaLlegada);
        c.add(Calendar.DATE, 1);
        fechaLlegada = c.getTime();
		
		boolean valida = tiqueteValidation.validaFechasTiqueta(fechaSalida, fechaLlegada);
		
		Assertions.assertTrue(valida);
	}
	
}
