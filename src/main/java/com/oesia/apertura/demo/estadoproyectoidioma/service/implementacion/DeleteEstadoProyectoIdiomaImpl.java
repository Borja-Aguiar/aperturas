package com.oesia.apertura.demo.estadoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.estadoproyectoidioma.repository.EstadoProyectoIdiomaRepository;
import com.oesia.apertura.demo.estadoproyectoidioma.service.interfaz.DeleteEstadoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEstadoProyectoIdiomaImpl implements DeleteEstadoProyectoIdiomaInterface {

    @Autowired
    private EstadoProyectoIdiomaRepository estadoProyectoIdiomaRepository;

    @Override
    public void deleteById(Long idEstadoProyectoIdioma) {
        estadoProyectoIdiomaRepository.deleteById(idEstadoProyectoIdioma);
    }
}
