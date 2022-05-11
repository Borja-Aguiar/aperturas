package com.oesia.apertura.demo.idioma.service.implementacion;

import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import com.oesia.apertura.demo.idioma.mapper.IdiomaMapper;
import com.oesia.apertura.demo.idioma.model.AddIdiomaDTO;
import com.oesia.apertura.demo.idioma.repository.IdiomaRepository;
import com.oesia.apertura.demo.idioma.service.interfaz.AddIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddIdiomaImpl implements AddIdiomaInterface {
    @Autowired
    private IdiomaRepository idiomaRepository;

    @Autowired
    private IdiomaMapper idiomaMapper;

    @Override
    public void add(AddIdiomaDTO addIdiomaDTO) {
        IdiomaEntity idiomaEntity = idiomaMapper.addIdiomaDTOToIdiomaEntity(addIdiomaDTO);
        idiomaRepository.save(idiomaEntity);
    }
}
