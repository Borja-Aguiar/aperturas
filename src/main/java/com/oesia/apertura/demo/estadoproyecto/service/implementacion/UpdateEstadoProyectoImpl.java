package com.oesia.apertura.demo.estadoproyecto.service.implementacion;

import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.estadoproyecto.mapper.EstadoProyectoMapper;
import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.repository.EstadoProyectoRepositorio;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.UpdateEstadoProyectoInterface;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEstadoProyectoImpl implements UpdateEstadoProyectoInterface {

    @Autowired
    private EstadoProyectoRepositorio estadoProyectoRepositorio;

    @Autowired
    private EstadoProyectoMapper estadoProyectoMapper;

    @Override
    public void update(EstadoProyectoDTO estadoProyectoDTO) {
        EstadoProyectoEntity estadoProyectoEntity = estadoProyectoRepositorio.findById(estadoProyectoDTO.getEstadoProyectoId()).orElse(null);

        if (estadoProyectoEntity==null){
                throw new IllegalArgumentException("Id es nulo");
        }

        estadoProyectoEntity = estadoProyectoMapper.estadoProyectoDTOToEstadoProyectoEntity(estadoProyectoDTO);
        estadoProyectoMapper.estadoProyectoEntityToEstadoProyectoDTO(estadoProyectoRepositorio.save(estadoProyectoEntity));
    }
}
