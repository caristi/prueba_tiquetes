package com.tiquete.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "vuelos")
@Getter
@Setter
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
	
    @OneToOne(mappedBy = "Tiquete")
	private Tiquete Tiquete;

}
