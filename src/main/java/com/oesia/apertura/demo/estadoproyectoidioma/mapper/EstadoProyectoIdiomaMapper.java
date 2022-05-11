package com.oesia.apertura.demo.estadoproyectoidioma.mapper;

import com.oesia.apertura.demo.estadoproyectoidioma.entities.EstadoProyectoIdiomaEntity;
import com.oesia.apertura.demo.estadoproyectoidioma.model.AddEstadoProyectoIdiomaDTO;
import com.oesia.apertura.demo.estadoproyectoidioma.model.EstadoProyectoIdiomaDTO;
import com.oesia.apertura.demo.estadoproyectoidioma.model.UpdateEstadoProyectoIdiomaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EstadoProyectoIdiomaMapper {

    @Mapping(source = "estadoProyectoIdiomaDTO.estadoProyectoId", target = "estadoProyectoEntity")
    @Mapping(source = "estadoProyectoIdiomaDTO.idiomaId", target = "idiomaEntity")
    EstadoProyectoIdiomaEntity estadoProyectoIdiomaDTOToEstadoProyectoIdiomaEntity(EstadoProyectoIdiomaDTO estadoProyectoIdiomaDTO);

    @Mapping(source = "estadoProyectoIdiomaEntity.estadoProyectoEntity", target = "estadoProyectoId")
    @Mapping(source = "estadoProyectoIdiomaEntity.idiomaEntity", target = "idiomaId")
    EstadoProyectoIdiomaDTO estadoProyectoIdiomaEntityToEstadoProyectoIdiomaDTO(EstadoProyectoIdiomaEntity estadoProyectoIdiomaEntity);

    @Mapping(source = "addEstadoProyectoIdiomaDTO.estadoProyectoId", target = "estadoProyectoEntity.estadoProyectoId")
    @Mapping(source = "addEstadoProyectoIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    EstadoProyectoIdiomaEntity addEstadoProyectoIdiomaDTOToEstadoProyectoIdiomaEntity(AddEstadoProyectoIdiomaDTO addEstadoProyectoIdiomaDTO);

    @Mapping(source = "updateEstadoProyectoIdiomaDTO.estadoProyectoId", target = "estadoProyectoEntity.estadoProyectoId")
    @Mapping(source = "updateEstadoProyectoIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    EstadoProyectoIdiomaEntity updateEstadoProyectoIdiomaDTOToEstadoProyectoIdiomaEntity(UpdateEstadoProyectoIdiomaDTO updateEstadoProyectoIdiomaDTO);
}
