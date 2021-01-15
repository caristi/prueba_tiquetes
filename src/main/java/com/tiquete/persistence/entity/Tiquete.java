package com.tiquete.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tiquetes")
public class Tiquete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tiquete")
	private Integer idTiquete;
	
	@Column(name = "mca_equipaje_bodeja")
	private String mcaEquipajeBodeja;
	
	@Column(name = "fec_salida")
	private Date fecSalida;
	
	@Column(name = "fec_llegada")
	private Date fecLlegada;
	
	@Column(name = "ciudad_origen")
	private String ciudadOrigen;
	
	@Column(name = "ciudad_destino")
	private String ciudadDestino;
	
	@Column(name = "nom_pasajero")
	private String nomPasajero;
	
	@Column(name = "edadPasajero")
	private int edadPasajero;
	
	private double precio;
	
	
	public Integer getIdTiquete() {
		return idTiquete;
	}

	public void setIdTiquete(Integer idTiquete) {
		this.idTiquete = idTiquete;
	}

	public String getMcaEquipajeBodeja() {
		return mcaEquipajeBodeja;
	}

	public void setMcaEquipajeBodeja(String mcaEquipajeBodeja) {
		this.mcaEquipajeBodeja = mcaEquipajeBodeja;
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

	public String getNomPasajero() {
		return nomPasajero;
	}

	public void setNomPasajero(String nomPasajero) {
		this.nomPasajero = nomPasajero;
	}

	public int getEdadPasajero() {
		return edadPasajero;
	}

	public void setEdadPasajero(int edadPasajero) {
		this.edadPasajero = edadPasajero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
