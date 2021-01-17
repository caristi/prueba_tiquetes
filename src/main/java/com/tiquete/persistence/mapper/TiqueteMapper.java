package com.tiquete.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.tiquete.domain.dto.Ticket;
import com.tiquete.domain.dto.TicketID;
import com.tiquete.persistence.entity.Tiquete;

@Component
@Mapper(componentModel = "spring")
public interface TiqueteMapper {

	@Mappings({
		@Mapping(source ="idTiquete",target="itineraryID"),
		@Mapping(source ="ciudadOrigen",target="ciudado_origen"),
		@Mapping(source ="ciudadDestino",target="ciudad_destino"),
		@Mapping(source ="edadPasajero",target="edad_pasajero"),
		@Mapping(source ="fecLlegada",target="fechaLlegada", dateFormat = "dd-MM-yyyy HH:mm"),
		@Mapping(source ="fecSalida",target="fechaSalida", dateFormat = "dd-MM-yyyy HH:mm"),
		@Mapping(source ="nomPasajero",target="nom_pasajero"),
		@Mapping(source ="precio",target="precio")
	})
	Ticket toTiquete(Tiquete tiquete);
	
	@InheritInverseConfiguration
	@Mappings({
		@Mapping(target = "mcaEquipajeBodeja", ignore = true)
	})
	Tiquete toTiquete(Ticket tiquete);
	
	List<Ticket> toTiquetes(List<Tiquete> tiquetes);
	
	@Mappings({
		@Mapping(source ="idTiquete",target="itineraryID")
	})
	TicketID toTiqueteSave(Tiquete tiquete);
}
