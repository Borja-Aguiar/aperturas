package com.oesia.apertura.demo.estadoproyecto.service.implementacion;

import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.estadoproyecto.mapper.EstadoProyectoMapper;
import com.oesia.apertura.demo.estadoproyecto.model.AddEstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.repository.EstadoProyectoRepository;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.AddEstadoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEstadoProyectoImpl implements AddEstadoProyectoInterface {

    @Autowired
    private EstadoProyectoRepository estadoProyectoRepository;

    @Autowired
    private EstadoProyectoMapper estadoProyectoMapper;

    @Override
    public void add(AddEstadoProyectoDTO addEstadoProyectoDTO) {
        EstadoProyectoEntity estadoProyectoEntity = estadoProyectoMapper.addEstadoProyectoDTOToEstadoProyectoEntity(addEstadoProyectoDTO);
        estadoProyectoRepository.save(estadoProyectoEntity);
    }

}
