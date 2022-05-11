package com.oesia.apertura.demo.estadolocalidioma.service.implementacion;

import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.AddEstadoLocalIdiomaInterface;
import com.oesia.apertura.demo.estadolocalidioma.entities.EstadoLocalIdiomaEntity;
import com.oesia.apertura.demo.estadolocalidioma.mapper.EstadoLocalIdiomaMapper;
import com.oesia.apertura.demo.estadolocalidioma.model.AddEstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.repository.EstadoLocalIdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEstadoLocalIdiomaImpl implements AddEstadoLocalIdiomaInterface {

    @Autowired
    private EstadoLocalIdiomaRepository estadoLocalIdiomaRepository;

    @Autowired
    private EstadoLocalIdiomaMapper estadoLocalIdiomaMapper;

    @Override
    public void add(AddEstadoLocalIdiomaDTO addEstadoLocalIdiomaDTO) {
        EstadoLocalIdiomaEntity estadoLocalIdiomaEntity = estadoLocalIdiomaMapper.addEstadoLocalIdiomaDTOToEstadoLocalIdiomaEntity(addEstadoLocalIdiomaDTO);
        estadoLocalIdiomaRepository.save(estadoLocalIdiomaEntity);
    }
}
