package com.oesia.apertura.demo.estadolocal.service.implementacion;

import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadolocal.mapper.EstadoLocalMapper;
import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.repository.EstadoLocalRepository;
import com.oesia.apertura.demo.estadolocal.service.interfaz.ListEstadoLocalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListEstadoLocalImpl implements ListEstadoLocalInterface {
    @Autowired
    private EstadoLocalRepository estadoLocalRepository;

    @Autowired
    private EstadoLocalMapper estadoLocalMapper;

    @Override
    public List<EstadoLocalDTO> list() {
        List<EstadoLocalEntity> estadoLocalEntities = estadoLocalRepository.findAll();

        List<EstadoLocalDTO> estadoLocalDTOS = new ArrayList<>();

        for (EstadoLocalEntity estadoLocalEntity : estadoLocalEntities) {

            estadoLocalDTOS.add(estadoLocalMapper.estadoLocalEntityToEstadoLocalDTO(estadoLocalEntity));

        }

        return estadoLocalDTOS;
    }
}
