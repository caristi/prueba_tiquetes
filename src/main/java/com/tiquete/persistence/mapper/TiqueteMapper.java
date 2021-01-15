package com.tiquete.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.tiquete.domain.dto.Tikect;
import com.tiquete.persistence.entity.Tiquete;

@Component
@Mapper(componentModel = "spring")
public interface TiqueteMapper {

	@Mappings({
		@Mapping(source ="idTiquete",target="idTickect"),
		@Mapping(source ="ciudadOrigen",target="ciudado_origen"),
		@Mapping(source ="ciudadDestino",target="ciudad_destino"),
		@Mapping(source ="edadPasajero",target="edad_pasajero"),
		@Mapping(source ="fecLlegada",target="fechaLlegada"),
		@Mapping(source ="fecSalida",target="fechaSalida"),
		@Mapping(source ="nomPasajero",target="nom_pasajero"),
		@Mapping(source ="precio",target="precio")
	})
	Tikect toTiquete(Tiquete tiquete);
	
	@InheritInverseConfiguration
	@Mappings({
		@Mapping(target = "mcaEquipajeBodeja", ignore = true)
	})
	Tiquete toTiquete(Tikect tiquete);
	
	List<Tikect> toTiquetes(List<Tiquete> tiquetes);
}
