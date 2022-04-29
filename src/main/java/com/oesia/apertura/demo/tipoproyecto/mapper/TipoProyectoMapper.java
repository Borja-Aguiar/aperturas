package com.oesia.apertura.demo.tipoproyecto.mapper;

import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import com.oesia.apertura.demo.tipoproyecto.model.AddTipoProyectoDTO;
import com.oesia.apertura.demo.tipoproyecto.model.TipoProyectoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoProyectoMapper {

    TipoProyectoEntity tipoProyectoDtotoTipoProyectoEntity(TipoProyectoDTO tipoProyectoDTO);

    TipoProyectoDTO tipoProyectoEntityToTipoProyectoDTO(TipoProyectoEntity tipoProyectoEntity);

    AddTipoProyectoDTO tipoProyectoEntityToAddTipoProyectoDTO(TipoProyectoEntity tipoProyectoEntity);

    TipoProyectoEntity AddTipoProyectoDtoToTipoProyectoEntity(AddTipoProyectoDTO addTipoProyectoDTO);
}
