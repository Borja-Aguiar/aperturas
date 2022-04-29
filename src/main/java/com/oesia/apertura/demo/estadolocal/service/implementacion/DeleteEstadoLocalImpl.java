package com.oesia.apertura.demo.estadolocal.service.implementacion;

import com.oesia.apertura.demo.estadolocal.repository.EstadoLocalRepository;
import com.oesia.apertura.demo.estadolocal.service.interfaz.DeleteEstadoLocalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEstadoLocalImpl implements DeleteEstadoLocalInterface {

    @Autowired
    private EstadoLocalRepository estadoLocalRepository;

    @Override
    public void deleteById(Long idEstadoLocal) {
        estadoLocalRepository.deleteById(idEstadoLocal);

    }
}
