package com.oesia.apertura.demo.estadolocal.mapper;

import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadolocal.model.AddEstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstadoLocalMapper {

    EstadoLocalDTO estadoLocalEntityToEstadoLocalDTO(EstadoLocalEntity estadoLocalEntity);

    EstadoLocalEntity estadoLocalDTOToEstadoLocalEntity(EstadoLocalDTO estadoLocalDTO);

    AddEstadoLocalDTO estadoLocalEntityToAddEstadoLocalDTO(EstadoLocalEntity estadoLocalEntity);

    EstadoLocalEntity addEstadoLocalDTOToEstadoLocalEntity(AddEstadoLocalDTO addestadoLocalDTO);
}
