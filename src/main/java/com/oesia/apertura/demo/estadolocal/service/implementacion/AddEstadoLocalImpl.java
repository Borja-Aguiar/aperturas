package com.oesia.apertura.demo.estadolocal.service.implementacion;

import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadolocal.mapper.EstadoLocalMapper;
import com.oesia.apertura.demo.estadolocal.model.AddEstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.repository.EstadoLocalRepository;
import com.oesia.apertura.demo.estadolocal.service.interfaz.AddEstadoLocalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEstadoLocalImpl implements AddEstadoLocalInterface {

    @Autowired
    private EstadoLocalRepository estadoLocalRepository;

    @Autowired
    private EstadoLocalMapper estadoLocalMapper;


    @Override
    public void add(AddEstadoLocalDTO addEstadoLocalDTO) {
        EstadoLocalEntity estadoLocalEntity = estadoLocalMapper.addEstadoLocalDTOToEstadoLocalEntity(addEstadoLocalDTO);
        estadoLocalRepository.save(estadoLocalEntity);
    }
}
