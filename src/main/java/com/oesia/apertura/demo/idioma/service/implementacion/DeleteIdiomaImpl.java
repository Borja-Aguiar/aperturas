package com.oesia.apertura.demo.idioma.service.implementacion;

import com.oesia.apertura.demo.estadoproyecto.repository.EstadoProyectoRepository;
import com.oesia.apertura.demo.idioma.repository.IdiomaRepository;
import com.oesia.apertura.demo.idioma.service.interfaz.DeleteIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteIdiomaImpl implements DeleteIdiomaInterface {
    @Autowired
    private IdiomaRepository idiomaRepository;

    @Override
    public void deleteById(long idIdioma) {
        idiomaRepository.deleteById(idIdioma);
    }
}
