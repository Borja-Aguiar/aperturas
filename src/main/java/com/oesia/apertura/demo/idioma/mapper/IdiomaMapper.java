package com.oesia.apertura.demo.idioma.mapper;

import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import com.oesia.apertura.demo.idioma.model.AddIdiomaDTO;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IdiomaMapper {

    IdiomaDTO IdiomaEntityToIdiomaDTO(IdiomaEntity idiomaEntity);

    IdiomaEntity IdiomaDTOToIdiomaEntity(IdiomaDTO idiomaDTO);

    AddIdiomaDTO IdiomaEntityToAddIdiomaDTO(IdiomaEntity idiomaEntity);

    IdiomaEntity addIdiomaDTOToIdiomaEntity(AddIdiomaDTO addIdiomaDTO);
}
