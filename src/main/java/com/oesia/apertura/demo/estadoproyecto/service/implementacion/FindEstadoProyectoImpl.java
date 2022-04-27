package com.oesia.apertura.demo.estadoproyecto.service.implementacion;

import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.estadoproyecto.mapper.EstadoProyectoMapper;
import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.repository.EstadoProyectoRepositorio;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.FindEstadoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindEstadoProyectoImpl implements FindEstadoProyectoInterface {

    @Autowired
    private EstadoProyectoRepositorio estadoProyectoRepositorio;

    @Autowired
    private EstadoProyectoMapper estadoProyectoMapper;

    @Override
    public EstadoProyectoDTO findById(Long idEstadoProyecto) {
        EstadoProyectoEntity estadoProyectoEntity = estadoProyectoRepositorio.findById(idEstadoProyecto).orElse(null);
        if (estadoProyectoEntity == null) {
            throw new IllegalArgumentException("The EstadoProyecto id is null");
        }
        return estadoProyectoMapper.estadoProyectoEntityToEstadoProyectoDTO(estadoProyectoEntity);
    }
}
