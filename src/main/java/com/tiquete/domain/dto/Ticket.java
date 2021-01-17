package com.tiquete.domain.dto;

public class Ticket {
	
	private int itineraryID;
	
	private String fechaSalida;
	
	private String fechaLlegada;
	
	private String ciudado_origen;
	
	private String ciudad_destino;
	
	private String nom_pasajero;
	
	private int edad_pasajero;
	
	private double precio;
	
	public int getItineraryID() {
		return itineraryID;
	}
	
	public void setItineraryID(int itineraryID) {
		this.itineraryID = itineraryID;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public String getCiudado_origen() {
		return ciudado_origen;
	}

	public void setCiudado_origen(String ciudado_origen) {
		this.ciudado_origen = ciudado_origen;
	}

	public String getCiudad_destino() {
		return ciudad_destino;
	}

	public void setCiudad_destino(String ciudad_destino) {
		this.ciudad_destino = ciudad_destino;
	}

	public String getNom_pasajero() {
		return nom_pasajero;
	}

	public void setNom_pasajero(String nom_pasajero) {
		this.nom_pasajero = nom_pasajero;
	}

	public int getEdad_pasajero() {
		return edad_pasajero;
	}

	public void setEdad_pasajero(int edad_pasajero) {
		this.edad_pasajero = edad_pasajero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
