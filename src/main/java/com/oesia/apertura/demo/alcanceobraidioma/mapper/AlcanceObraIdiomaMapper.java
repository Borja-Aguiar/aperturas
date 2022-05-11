package com.oesia.apertura.demo.alcanceobraidioma.mapper;

import com.oesia.apertura.demo.alcanceobraidioma.entities.AlcanceObraIdiomaEntity;
import com.oesia.apertura.demo.alcanceobraidioma.model.AddAlcanceObraIdiomaDTO;
import com.oesia.apertura.demo.alcanceobraidioma.model.AlcanceObraIdiomaDTO;
import com.oesia.apertura.demo.alcanceobraidioma.model.UpdateAlcanceObraIdiomaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AlcanceObraIdiomaMapper {

    @Mapping(source = "alcanceObraIdiomaDTO.alcanceObraId", target = "alcanceObraEntity")
    @Mapping(source = "alcanceObraIdiomaDTO.idiomaId", target = "idiomaEntity")
    AlcanceObraIdiomaEntity alcanceObraIdiomaDTOToAlcanceObraIdiomaEntity(AlcanceObraIdiomaDTO alcanceObraIdiomaDTO);

    @Mapping(source = "alcanceObraIdiomaEntity.alcanceObraEntity", target = "alcanceObraId")
    @Mapping(source = "alcanceObraIdiomaEntity.idiomaEntity", target = "idiomaId")
    AlcanceObraIdiomaDTO alcanceObraIdiomaEntityToAlcanceObraIdiomaDTO(AlcanceObraIdiomaEntity alcanceObraIdiomaEntity);

    @Mapping(source = "addAlcanceObraIdiomaDTO.alcanceObraId", target = "alcanceObraEntity.alcanceObraId")
    @Mapping(source = "addAlcanceObraIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    AlcanceObraIdiomaEntity addAlcanceObraIdiomaDTOToAlcanceObraIdiomaEntity(AddAlcanceObraIdiomaDTO addAlcanceObraIdiomaDTO);

    @Mapping(source = "updateAlcanceObraIdiomaDTO.alcanceObraId", target = "alcanceObraEntity.alcanceObraId")
    @Mapping(source = "updateAlcanceObraIdiomaDTO.idiomaId", target = "idiomaEntity.idiomaId")
    AlcanceObraIdiomaEntity updateAlcanceObraIdiomaDTOToAlcanceObraIdiomaEntity(UpdateAlcanceObraIdiomaDTO updateAlcanceObraIdiomaDTO);

}
