package com.oesia.apertura.demo.estadolocalidioma.service.implementacion;

import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.ListEstadoLocalIdiomaInterface;
import com.oesia.apertura.demo.estadolocalidioma.entities.EstadoLocalIdiomaEntity;
import com.oesia.apertura.demo.estadolocalidioma.mapper.EstadoLocalIdiomaMapper;
import com.oesia.apertura.demo.estadolocalidioma.model.EstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.repository.EstadoLocalIdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListEstadoLocalIdiomaImpl implements ListEstadoLocalIdiomaInterface {

    @Autowired
    private EstadoLocalIdiomaRepository estadoLocalIdiomaRepository;

    @Autowired
    private EstadoLocalIdiomaMapper estadoLocalIdiomaMapper;

    @Override
    public List<EstadoLocalIdiomaDTO> list() {
        List<EstadoLocalIdiomaEntity> estadoLocalIdiomaEntities = estadoLocalIdiomaRepository.findAll();

        List<EstadoLocalIdiomaDTO> estadoLocalIdiomaDTOS = new ArrayList<>();

        for (EstadoLocalIdiomaEntity estadoLocalIdiomaEntity : estadoLocalIdiomaEntities) {
            estadoLocalIdiomaDTOS.add(estadoLocalIdiomaMapper.estadoLocalIdiomaEntityToEstadoLocalIdiomaDTO(estadoLocalIdiomaEntity));
        }
        return estadoLocalIdiomaDTOS;
    }
}
