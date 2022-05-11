package com.oesia.apertura.demo.idioma.service.implementacion;

import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import com.oesia.apertura.demo.idioma.mapper.IdiomaMapper;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import com.oesia.apertura.demo.idioma.repository.IdiomaRepository;
import com.oesia.apertura.demo.idioma.service.interfaz.ListIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListIdiomaImpl implements ListIdiomaInterface {

    @Autowired
    private IdiomaRepository idiomaRepository;

    @Autowired
    private IdiomaMapper idiomaMapper;

    @Override
    public List<IdiomaDTO> list() {
        List<IdiomaEntity> idiomaEntities = idiomaRepository.findAll();

        List<IdiomaDTO> idiomaDTOS = new ArrayList<>();

        for (IdiomaEntity idiomaEntity : idiomaEntities) {
            idiomaDTOS.add(idiomaMapper.IdiomaEntityToIdiomaDTO(idiomaEntity));
        }
        return idiomaDTOS;
    }
}
