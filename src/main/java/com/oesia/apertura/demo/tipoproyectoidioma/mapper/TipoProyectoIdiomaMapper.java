package com.oesia.apertura.demo.tipoproyectoidioma.mapper;

import com.oesia.apertura.demo.tipoproyectoidioma.entities.TipoProyectoIdiomaEntity;
import com.oesia.apertura.demo.tipoproyectoidioma.model.AddTipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.model.TipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.model.UpdateTipoProyectoIdiomaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TipoProyectoIdiomaMapper {

    @Mapping(source = "tipoProyectoIdiomaDTO.tipoProyectoId", target = "tipoProyectoEntity")
    @Mapping(source = "tipoProyectoIdiomaDTO.idiomaId", target = "idiomaEntity")
    TipoProyectoIdiomaEntity tipoProyectoIdiomaDTOToTipoProyectoIdiomaEntity(TipoProyectoIdiomaDTO tipoProyectoIdiomaDTO);

    @Mapping(source = "tipoProyectoIdiomaEntity.tipoProyectoEntity", target = "tipoProyectoId")
    @Mapping(source = "tipoProyectoIdiomaEntity.idiomaEntity", target = "idiomaId")
    TipoProyectoIdiomaDTO tipoProyectoIdiomaEntityToTipoProyectoIdiomaDTO(TipoProyectoIdiomaEntity tipoProyectoIdiomaEntity);

    @Mapping(source = "addTipoProyectoIdiomaDTO.tipoProyectoId", target = "tipoProyectoEntity.tipoProyectoId")
    @Mapping(source = "addTipoProyectoIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    TipoProyectoIdiomaEntity addTipoProyectoIdiomaDTOToTipoProyectoIdiomaEntity(AddTipoProyectoIdiomaDTO addTipoProyectoIdiomaDTO);

    @Mapping(source = "updateTipoProyectoIdiomaDTO.tipoProyectoId", target = "tipoProyectoEntity.tipoProyectoId")
    @Mapping(source = "updateTipoProyectoIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    TipoProyectoIdiomaEntity updateTipoProyectoIdiomaDTOToTipoProyectoIdiomaEntity(UpdateTipoProyectoIdiomaDTO updateTipoProyectoIdiomaDTO);
}
