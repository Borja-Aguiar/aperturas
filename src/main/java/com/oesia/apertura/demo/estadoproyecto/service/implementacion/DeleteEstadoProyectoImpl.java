package com.oesia.apertura.demo.estadoproyecto.service.implementacion;

import com.oesia.apertura.demo.estadoproyecto.repository.EstadoProyectoRepository;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.DeleteEstadoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEstadoProyectoImpl implements DeleteEstadoProyectoInterface {

    @Autowired
    private EstadoProyectoRepository estadoProyectoRepository;

    @Override
    public void deleteById(Long idEstadoProyecto) {
        estadoProyectoRepository.deleteById(idEstadoProyecto);
    }
}
