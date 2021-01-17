package com.tiquete.validation;

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
	public void validaFechaSalidaMenorAFechaLlegada() {
		
		String fechaSalida  = "14-01-2021 20:15";
		String fechaLlegada = "15-01-2021 21:15";
		
		boolean valida = tiqueteValidation.validaFechasTiqueta(fechaSalida, fechaLlegada);
		
		Assertions.assertTrue(valida);
	}
	
	@Test
	public void validaFechaSalidaMayorFechaLlegada() {
		
		String fechaSalida  = "16-01-2021 20:15";
		String fechaLlegada = "15-01-2021 21:15";
        
        boolean valida = tiqueteValidation.validaFechasTiqueta(fechaSalida, fechaLlegada);
		
        Assertions.assertFalse(valida);
	}
	
	@Test
	public void validaPrecioMayorACero() {
		
		Double precio = new Double(100);
		
		boolean valida = tiqueteValidation.validaPrecio(precio);
		
		Assertions.assertTrue(valida);
	}
	
	@Test
	public void validaPrecioMenorCero() {
		
		Double precio = new Double(-11);
		
		boolean valida = tiqueteValidation.validaPrecio(precio);
		
		Assertions.assertFalse(valida);
		
	}
	
}
