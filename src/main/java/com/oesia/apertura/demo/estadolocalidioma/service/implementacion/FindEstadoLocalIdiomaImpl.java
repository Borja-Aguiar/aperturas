package com.oesia.apertura.demo.estadolocalidioma.service.implementacion;

import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.FindEstadoLocalIdiomaInterface;
import com.oesia.apertura.demo.estadolocalidioma.entities.EstadoLocalIdiomaEntity;
import com.oesia.apertura.demo.estadolocalidioma.mapper.EstadoLocalIdiomaMapper;
import com.oesia.apertura.demo.estadolocalidioma.model.EstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.repository.EstadoLocalIdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindEstadoLocalIdiomaImpl implements FindEstadoLocalIdiomaInterface {

    @Autowired
    private EstadoLocalIdiomaRepository estadoLocalIdiomaRepository;

    @Autowired
    private EstadoLocalIdiomaMapper estadoLocalIdiomaMapper;

    @Override
    public EstadoLocalIdiomaDTO findById(long idEstadoLocalIdioma) {
        EstadoLocalIdiomaEntity estadoLocalIdiomaEntity = estadoLocalIdiomaRepository.findById(idEstadoLocalIdioma).orElse(null);
        if (estadoLocalIdiomaEntity == null) {
            throw new IllegalArgumentException("The EstadoLocalIdioma id is null");
        }
        return estadoLocalIdiomaMapper.estadoLocalIdiomaEntityToEstadoLocalIdiomaDTO(estadoLocalIdiomaEntity);
    }
}
