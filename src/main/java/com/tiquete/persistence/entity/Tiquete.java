package com.tiquete.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Tiquete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tiquete")
	private Integer idTiquete;
	
	@Column(name = "mca_equipaje_bodeja")
	private String mcaEquipajeBodeja;
	
	@OneToOne
	@JoinColumn(name = "id_vuelo", insertable = false, updatable = false)
	private Vuelo idVuelo;
	
	@OneToOne
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	private Cliente idCliente;
}
