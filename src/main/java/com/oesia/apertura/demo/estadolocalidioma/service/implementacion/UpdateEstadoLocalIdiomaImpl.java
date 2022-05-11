package com.oesia.apertura.demo.estadolocalidioma.service.implementacion;

import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.UpdateEstadoLocalIdiomaInterface;
import com.oesia.apertura.demo.estadolocalidioma.entities.EstadoLocalIdiomaEntity;
import com.oesia.apertura.demo.estadolocalidioma.mapper.EstadoLocalIdiomaMapper;
import com.oesia.apertura.demo.estadolocalidioma.model.EstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.repository.EstadoLocalIdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEstadoLocalIdiomaImpl implements UpdateEstadoLocalIdiomaInterface {

    @Autowired
    private EstadoLocalIdiomaMapper estadoLocalIdiomaMapper;

    @Autowired
    private EstadoLocalIdiomaRepository estadoLocalIdiomaRepository;

    @Override
    public void update(EstadoLocalIdiomaDTO estadoLocalIdiomaDTO) {
        EstadoLocalIdiomaEntity estadoLocalIdiomaEntity = estadoLocalIdiomaRepository.findById(estadoLocalIdiomaDTO.getEstadoLocalIdiomaId()).orElse(null);

        if (estadoLocalIdiomaEntity == null) {
            throw new IllegalArgumentException("Id is null");
        }

        estadoLocalIdiomaEntity = estadoLocalIdiomaMapper.estadoLocalIdiomaDTOToEstadoLocalIdiomaEntity(estadoLocalIdiomaDTO);
        estadoLocalIdiomaMapper.estadoLocalIdiomaEntityToEstadoLocalIdiomaDTO(estadoLocalIdiomaRepository.save(estadoLocalIdiomaEntity));

    }
}
