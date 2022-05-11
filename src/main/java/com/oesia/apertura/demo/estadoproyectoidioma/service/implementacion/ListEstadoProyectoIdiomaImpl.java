package com.oesia.apertura.demo.estadoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.estadoproyecto.service.interfaz.ListEstadoProyectoInterface;
import com.oesia.apertura.demo.estadoproyectoidioma.entities.EstadoProyectoIdiomaEntity;
import com.oesia.apertura.demo.estadoproyectoidioma.mapper.EstadoProyectoIdiomaMapper;
import com.oesia.apertura.demo.estadoproyectoidioma.model.EstadoProyectoIdiomaDTO;
import com.oesia.apertura.demo.estadoproyectoidioma.repository.EstadoProyectoIdiomaRepository;
import com.oesia.apertura.demo.estadoproyectoidioma.service.interfaz.ListEstadoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListEstadoProyectoIdiomaImpl implements ListEstadoProyectoIdiomaInterface {

    @Autowired
    private EstadoProyectoIdiomaRepository estadoProyectoIdiomaRepository;

    @Autowired
    private EstadoProyectoIdiomaMapper estadoProyectoIdiomaMapper;

    @Override
    public List<EstadoProyectoIdiomaDTO> list() {
        List<EstadoProyectoIdiomaEntity> estadoProyectoIdiomaEntities = estadoProyectoIdiomaRepository.findAll();

        List<EstadoProyectoIdiomaDTO> estadoProyectoIdiomaDTOS = new ArrayList<>();

        for (EstadoProyectoIdiomaEntity estadoProyectoIdiomaEntity : estadoProyectoIdiomaEntities) {
            estadoProyectoIdiomaDTOS.add(estadoProyectoIdiomaMapper.estadoProyectoIdiomaEntityToEstadoProyectoIdiomaDTO(estadoProyectoIdiomaEntity));
        }
        return estadoProyectoIdiomaDTOS;
    }
}
