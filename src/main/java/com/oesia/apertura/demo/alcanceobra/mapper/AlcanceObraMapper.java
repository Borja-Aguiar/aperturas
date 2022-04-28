package com.oesia.apertura.demo.alcanceobra.mapper;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.alcanceobra.model.AddAlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlcanceObraMapper {

    AlcanceObraDTO alcanceObraEntityToAlcanceObraDTO(AlcanceObraEntity alcanceObraEntity);

    AlcanceObraEntity alcanceObraDTOToAlcanceObraEntity(AlcanceObraDTO alcanceObraDTO);

    AddAlcanceObraDTO AlcanceObraEntityToAddAlcanceObraDTO(AlcanceObraEntity alcanceObraEntity);

    AlcanceObraEntity addAlcanceObraDTOToAlcanceObraEntity(AddAlcanceObraDTO addAlcanceObraDTO);

}
