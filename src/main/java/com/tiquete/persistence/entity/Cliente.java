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
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	@Column(name = "num_id")
	private String numId;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private String telefono1;
	
	private String telefono2;
	
	private String direccion;

	@Column(name = "fec_nacimiento")
	private Date fecNacimiento;
	
    @OneToOne(mappedBy = "Tiquete")
	private Tiquete tiquete;
	
}
