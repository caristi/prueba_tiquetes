package com.tiquete.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "vuelos")
public class Vuelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vuelo")
	private Integer idVuelo;
	
	@Column(name = "cod_avion")
	private String codAvion; 
	
	@Column(name = "num_pasajeros")
	private Integer numPasajeros;
	
	@Column(name = "ciudad_origen")
	private String ciudadOrigen; 
	
	@Column(name = "ciudad_destino")
	private String ciudadDestino; 
	
	@Column(name = "fec_salida")
	private Date fecSalida; 
	
	@Column(name = "fec_llegada")
	private Date fecLlegada; 
	
	private Double precio;
	
	public Integer getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getCodAvion() {
		return codAvion;
	}

	public void setCodAvion(String codAvion) {
		this.codAvion = codAvion;
	}

	public Integer getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(Integer numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Date getFecSalida() {
		return fecSalida;
	}

	public void setFecSalida(Date fecSalida) {
		this.fecSalida = fecSalida;
	}

	public Date getFecLlegada() {
		return fecLlegada;
	}

	public void setFecLlegada(Date fecLlegada) {
		this.fecLlegada = fecLlegada;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
