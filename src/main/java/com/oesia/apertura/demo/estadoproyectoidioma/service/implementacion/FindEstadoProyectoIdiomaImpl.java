package com.oesia.apertura.demo.estadoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.estadoproyectoidioma.entities.EstadoProyectoIdiomaEntity;
import com.oesia.apertura.demo.estadoproyectoidioma.mapper.EstadoProyectoIdiomaMapper;
import com.oesia.apertura.demo.estadoproyectoidioma.model.EstadoProyectoIdiomaDTO;
import com.oesia.apertura.demo.estadoproyectoidioma.repository.EstadoProyectoIdiomaRepository;
import com.oesia.apertura.demo.estadoproyectoidioma.service.interfaz.FindEstadoProyectoIdiomaInterface;
import com.oesia.apertura.demo.tipoproyectoidioma.model.TipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.FindTipoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindEstadoProyectoIdiomaImpl implements FindEstadoProyectoIdiomaInterface {

    @Autowired
    private EstadoProyectoIdiomaRepository estadoProyectoIdiomaRepository;

    @Autowired
    private EstadoProyectoIdiomaMapper estadoProyectoIdiomaMapper;

    @Override
    public EstadoProyectoIdiomaDTO findById(long idEstadoProyectoIdioma) {
        EstadoProyectoIdiomaEntity estadoProyectoIdiomaEntity = estadoProyectoIdiomaRepository.findById(idEstadoProyectoIdioma).orElse(null);
        if (estadoProyectoIdiomaEntity == null) {
            throw new IllegalArgumentException("The EstadoProyectoIdioma id is null");
        }
        return estadoProyectoIdiomaMapper.estadoProyectoIdiomaEntityToEstadoProyectoIdiomaDTO(estadoProyectoIdiomaEntity);
    }
}
