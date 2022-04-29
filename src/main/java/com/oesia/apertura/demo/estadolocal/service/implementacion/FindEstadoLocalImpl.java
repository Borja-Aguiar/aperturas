package com.oesia.apertura.demo.estadolocal.service.implementacion;

import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadolocal.mapper.EstadoLocalMapper;
import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.repository.EstadoLocalRepository;
import com.oesia.apertura.demo.estadolocal.service.interfaz.FindEstadoLocalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindEstadoLocalImpl implements FindEstadoLocalInterface {

    @Autowired
    private EstadoLocalRepository estadoLocalRepository;

    @Autowired
    private EstadoLocalMapper estadoLocalMapper;

    @Override
    public EstadoLocalDTO findEstadoLocalById(Long idEstadoLocal) {
        EstadoLocalEntity estadoLocalEntity = estadoLocalRepository.findById(idEstadoLocal).orElse(null);
        if (estadoLocalEntity == null) {
            throw new IllegalArgumentException("EstadoLocal id is null");
        }

        return estadoLocalMapper.estadoLocalEntityToEstadoLocalDTO(estadoLocalEntity);
    }
}
