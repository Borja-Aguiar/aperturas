package com.oesia.apertura.demo.estadolocalidioma.service.implementacion;

import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.DeleteEstadoLocalIdiomaInterface;
import com.oesia.apertura.demo.estadolocalidioma.repository.EstadoLocalIdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEstadoLocalIdiomaImpl implements DeleteEstadoLocalIdiomaInterface {

    @Autowired
    private EstadoLocalIdiomaRepository estadoLocalIdiomaRepository;

    @Override
    public void deleteById(long idEstadoLocalIdioma) {
        estadoLocalIdiomaRepository.deleteById(idEstadoLocalIdioma);
    }
}
