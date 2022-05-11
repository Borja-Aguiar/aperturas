package com.oesia.apertura.demo.obraidioma.mapper;

import com.oesia.apertura.demo.obraidioma.entities.ObraIdiomaEntity;
import com.oesia.apertura.demo.obraidioma.model.AddObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.model.ObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.model.UpdateObraIdiomaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ObraIdiomaMapper {

    @Mapping(source = "obraIdiomaDTO.obraId", target = "obraEntity")
    @Mapping(source = "obraIdiomaDTO.tipoProyectoId", target = "tipoProyectoEntity")
    @Mapping(source = "obraIdiomaDTO.estadoLocalId", target = "estadoLocalEntity")
    @Mapping(source = "obraIdiomaDTO.alcanceObraId", target = "alcanceObraEntity")
    @Mapping(source = "obraIdiomaDTO.estadoProyectoId", target = "estadoProyectoEntity")
    @Mapping(source = "obraIdiomaDTO.idiomaId", target = "idiomaEntity")
    ObraIdiomaEntity obraIdiomaDTOToObraIdiomaEntity(ObraIdiomaDTO obraIdiomaDTO);

    @Mapping(source = "obraIdiomaEntity.obraEntity", target = "obraId")
    @Mapping(source = "obraIdiomaEntity.tipoProyectoEntity", target = "tipoProyectoId")
    @Mapping(source = "obraIdiomaEntity.estadoLocalEntity", target = "estadoLocalId")
    @Mapping(source = "obraIdiomaEntity.alcanceObraEntity", target = "alcanceObraId")
    @Mapping(source = "obraIdiomaEntity.estadoProyectoEntity", target = "estadoProyectoId")
    @Mapping(source = "obraIdiomaEntity.idiomaEntity", target = "idiomaId")
    ObraIdiomaDTO obraIdiomaEntityToObraIdiomaDTO(ObraIdiomaEntity obraIdiomaEntity);

    @Mapping(source = "addObraIdiomaDTO.obraId", target = "obraEntity.obraId")
    @Mapping(source = "addObraIdiomaDTO.tipoProyectoId", target = "tipoProyectoEntity.tipoProyectoId")
    @Mapping(source = "addObraIdiomaDTO.estadoLocalId", target = "estadoLocalEntity.estadoLocalId")
    @Mapping(source = "addObraIdiomaDTO.alcanceObraId", target = "alcanceObraEntity.alcanceObraId")
    @Mapping(source = "addObraIdiomaDTO.estadoProyectoId", target = "estadoProyectoEntity.estadoProyectoId")
    @Mapping(source = "addObraIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    ObraIdiomaEntity addObraIdiomaDTOToObraIdiomaEntity(AddObraIdiomaDTO addObraIdiomaDTO);

    @Mapping(source = "updateObraIdiomaDTO.obraId", target = "obraEntity.obraId")
    @Mapping(source = "updateObraIdiomaDTO.tipoProyectoId", target = "tipoProyectoEntity.tipoProyectoId")
    @Mapping(source = "updateObraIdiomaDTO.estadoLocalId", target = "estadoLocalEntity.estadoLocalId")
    @Mapping(source = "updateObraIdiomaDTO.alcanceObraId", target = "alcanceObraEntity.alcanceObraId")
    @Mapping(source = "updateObraIdiomaDTO.estadoProyectoId", target = "estadoProyectoEntity.estadoProyectoId")
    @Mapping(source = "updateObraIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    ObraIdiomaEntity updateObraIdiomaDTOToObraIdiomaEntity(UpdateObraIdiomaDTO updateObraIdiomaDTO);
}
