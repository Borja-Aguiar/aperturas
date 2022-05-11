package com.oesia.apertura.demo.estadoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.estadoproyectoidioma.entities.EstadoProyectoIdiomaEntity;
import com.oesia.apertura.demo.estadoproyectoidioma.mapper.EstadoProyectoIdiomaMapper;
import com.oesia.apertura.demo.estadoproyectoidioma.model.EstadoProyectoIdiomaDTO;
import com.oesia.apertura.demo.estadoproyectoidioma.repository.EstadoProyectoIdiomaRepository;
import com.oesia.apertura.demo.estadoproyectoidioma.service.interfaz.UpdateEstadoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEstadoProyectoIdiomaImpl implements UpdateEstadoProyectoIdiomaInterface {

    @Autowired
    private EstadoProyectoIdiomaMapper estadoProyectoIdiomaMapper;

    @Autowired
    private EstadoProyectoIdiomaRepository estadoProyectoIdiomaRepository;

    @Override
    public void update(EstadoProyectoIdiomaDTO estadoProyectoIdiomaDTO) {
        EstadoProyectoIdiomaEntity estadoProyectoIdiomaEntity = estadoProyectoIdiomaRepository.findById(estadoProyectoIdiomaDTO.getEstadoProyectoIdiomaId()).orElse(null);

        if (estadoProyectoIdiomaEntity == null) {
            throw new IllegalArgumentException("Id is null");
        }

        estadoProyectoIdiomaEntity = estadoProyectoIdiomaMapper.estadoProyectoIdiomaDTOToEstadoProyectoIdiomaEntity(estadoProyectoIdiomaDTO);
        estadoProyectoIdiomaMapper.estadoProyectoIdiomaEntityToEstadoProyectoIdiomaDTO(estadoProyectoIdiomaRepository.save(estadoProyectoIdiomaEntity));
    }
}
