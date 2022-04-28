package com.oesia.apertura.demo.estadoproyecto.service.implementacion;

import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.estadoproyecto.mapper.EstadoProyectoMapper;
import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.repository.EstadoProyectoRepository;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.ListEstadoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListEstadoProyectoImpl implements ListEstadoProyectoInterface {

    @Autowired
    private EstadoProyectoRepository estadoProyectoRepository;

    @Autowired
    private EstadoProyectoMapper estadoProyectoMapper;

    @Override
    public List<EstadoProyectoDTO> list() {

        List<EstadoProyectoEntity> estadoProyectoEntities = estadoProyectoRepository.findAll();

        List<EstadoProyectoDTO> estadoProyectoDTOS = new ArrayList<>();

        for (EstadoProyectoEntity estadoProyectoEntity : estadoProyectoEntities) {

            estadoProyectoDTOS.add(estadoProyectoMapper.estadoProyectoEntityToEstadoProyectoDTO(estadoProyectoEntity));

        }

        return estadoProyectoDTOS;
    }
}
