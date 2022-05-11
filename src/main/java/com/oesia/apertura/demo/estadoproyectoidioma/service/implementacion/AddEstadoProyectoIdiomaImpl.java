package com.oesia.apertura.demo.estadoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.estadoproyectoidioma.entities.EstadoProyectoIdiomaEntity;
import com.oesia.apertura.demo.estadoproyectoidioma.mapper.EstadoProyectoIdiomaMapper;
import com.oesia.apertura.demo.estadoproyectoidioma.model.AddEstadoProyectoIdiomaDTO;
import com.oesia.apertura.demo.estadoproyectoidioma.repository.EstadoProyectoIdiomaRepository;
import com.oesia.apertura.demo.estadoproyectoidioma.service.interfaz.AddEstadoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEstadoProyectoIdiomaImpl implements AddEstadoProyectoIdiomaInterface {

    @Autowired
    private EstadoProyectoIdiomaRepository estadoProyectoIdiomaRepository;

    @Autowired
    private EstadoProyectoIdiomaMapper estadoProyectoIdiomaMapper;

    @Override
    public void add(AddEstadoProyectoIdiomaDTO addEstadoProyectoIdiomaDTO) {
        EstadoProyectoIdiomaEntity estadoProyectoIdiomaEntity = estadoProyectoIdiomaMapper.addEstadoProyectoIdiomaDTOToEstadoProyectoIdiomaEntity(addEstadoProyectoIdiomaDTO);
        estadoProyectoIdiomaRepository.save(estadoProyectoIdiomaEntity);

    }
}
