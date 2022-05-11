package com.oesia.apertura.demo.estadolocalidioma.mapper;

import com.oesia.apertura.demo.estadolocalidioma.entities.EstadoLocalIdiomaEntity;
import com.oesia.apertura.demo.estadolocalidioma.model.AddEstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.model.EstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.model.UpdateEstadoLocalIdiomaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EstadoLocalIdiomaMapper {

    @Mapping(source = "estadoLocalIdiomaDTO.estadoLocalId", target = "estadoLocalEntity")
    @Mapping(source = "estadoLocalIdiomaDTO.idiomaId", target = "idiomaEntity")
    EstadoLocalIdiomaEntity estadoLocalIdiomaDTOToEstadoLocalIdiomaEntity(EstadoLocalIdiomaDTO estadoLocalIdiomaDTO);

    @Mapping(source = "estadoLocalIdiomaEntity.estadoLocalEntity", target = "estadoLocalId")
    @Mapping(source = "estadoLocalIdiomaEntity.idiomaEntity", target = "idiomaId")
    EstadoLocalIdiomaDTO estadoLocalIdiomaEntityToEstadoLocalIdiomaDTO(EstadoLocalIdiomaEntity estadoLocalIdiomaEntity);

    @Mapping(source = "addEstadoLocalIdiomaDTO.estadoLocalId", target = "estadoLocalEntity.estadoLocalId")
    @Mapping(source = "addEstadoLocalIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    EstadoLocalIdiomaEntity addEstadoLocalIdiomaDTOToEstadoLocalIdiomaEntity(AddEstadoLocalIdiomaDTO addEstadoLocalIdiomaDTO);

    @Mapping(source = "updateEstadoLocalIdiomaDTO.estadoLocalId", target = "estadoLocalEntity.estadoLocalId")
    @Mapping(source = "updateEstadoLocalIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    EstadoLocalIdiomaEntity updateEstadoLocalIdiomaDTOToEstadoLocalIdiomaEntity(UpdateEstadoLocalIdiomaDTO updateEstadoLocalIdiomaDTO);

}
