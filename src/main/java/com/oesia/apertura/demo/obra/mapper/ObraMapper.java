package com.oesia.apertura.demo.obra.mapper;

import com.oesia.apertura.demo.obra.entities.ObraEntity;
import com.oesia.apertura.demo.obra.model.AddObraDTO;
import com.oesia.apertura.demo.obra.model.ObraDTO;
import com.oesia.apertura.demo.obra.model.UpdateObraDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ObraMapper {

    @Mapping(source = "obraDTO.tipoProyectoId", target = "tipoProyectoEntity")
    @Mapping(source = "obraDTO.estadoLocalId", target = "estadoLocalEntity")
    @Mapping(source = "obraDTO.alcanceObraId", target = "alcanceObraEntity")
    @Mapping(source = "obraDTO.estadoProyectoId", target = "estadoProyectoEntity")
    ObraEntity obraDTOToObraEntity(ObraDTO obraDTO);

    @Mapping(source = "obraEntity.tipoProyectoEntity", target = "tipoProyectoId")
    @Mapping(source = "obraEntity.estadoLocalEntity", target = "estadoLocalId")
    @Mapping(source = "obraEntity.alcanceObraEntity", target = "alcanceObraId")
    @Mapping(source = "obraEntity.estadoProyectoEntity", target = "estadoProyectoId")
    ObraDTO obraEntityToObraDTO(ObraEntity obraEntity);

    @Mapping(source = "addObraDTO.tipoProyectoId", target = "tipoProyectoEntity.tipoProyectoId")
    @Mapping(source = "addObraDTO.estadoLocalId", target = "estadoLocalEntity.estadoLocalId")
    @Mapping(source = "addObraDTO.alcanceObraId", target = "alcanceObraEntity.alcanceObraId")
    @Mapping(source = "addObraDTO.estadoProyectoId", target = "estadoProyectoEntity.estadoProyectoId")
    ObraEntity addObraDTOToObraEntity(AddObraDTO addObraDTO);

    @Mapping(source = "updateObraDTO.tipoProyectoId", target = "tipoProyectoEntity.tipoProyectoId")
    @Mapping(source = "updateObraDTO.estadoLocalId", target = "estadoLocalEntity.estadoLocalId")
    @Mapping(source = "updateObraDTO.alcanceObraId", target = "alcanceObraEntity.alcanceObraId")
    @Mapping(source = "updateObraDTO.estadoProyectoId", target = "estadoProyectoEntity.estadoProyectoId")
    ObraEntity updateObraDTOToObraEntity(UpdateObraDTO updateObraDTO);

}
