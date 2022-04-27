package com.oesia.apertura.demo.estadoproyecto.service.implementacion;

import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.estadoproyecto.model.AddEstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.repository.EstadoProyectoRepositorio;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.DeleteEstadoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEstadoProyectoImpl implements DeleteEstadoProyectoInterface {

    @Autowired
    private EstadoProyectoRepositorio estadoProyectoRepositorio;

    @Override
    public void deleteById(Long idEstadoProyecto) {
        estadoProyectoRepositorio.deleteById(idEstadoProyecto);
    }
}
