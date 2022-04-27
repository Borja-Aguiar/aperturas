package com.oesia.apertura.demo.estadoproyecto.mapper;

import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.estadoproyecto.model.AddEstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstadoProyectoMapper {

    EstadoProyectoDTO estadoProyectoEntityToEstadoProyectoDTO(EstadoProyectoEntity estadoProyectoEntity);

    EstadoProyectoEntity estadoProyectoDTOToEstadoProyectoEntity(EstadoProyectoDTO estadoProyectoDTO);

    AddEstadoProyectoDTO estadoProyectoEntityToAddEstadoProyectoDTO(EstadoProyectoEntity estadoProyectoEntity);

    EstadoProyectoEntity addEstadoProyectoDTOToEstadoProyectoEntity(AddEstadoProyectoDTO addestadoProyectoDTO);

}