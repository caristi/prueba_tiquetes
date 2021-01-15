package com.tiquete.domain.dto;

import java.util.Date;

public class Tikect {
	
	private int idTickect;
	
	private Date fechaSalida;
	
	private Date fechaLlegada;
	
	private String ciudado_origen;
	
	private String ciudad_destino;
	
	private String nom_pasajero;
	
	private int edad_pasajero;
	
	private double precio;
	
	public int getIdTickect() {
		return idTickect;
	}
	
	public void setIdTickect(int idTickect) {
		this.idTickect = idTickect;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
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
