package com.oesia.apertura.demo.estadolocal.service.implementacion;

import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadolocal.mapper.EstadoLocalMapper;
import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.repository.EstadoLocalRepository;
import com.oesia.apertura.demo.estadolocal.service.interfaz.UpdateEstadoLocalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEstadoLocalImpl implements UpdateEstadoLocalInterface {

    @Autowired
    private EstadoLocalRepository estadoLocalRepository;

    @Autowired
    private EstadoLocalMapper estadoLocalMapper;
    @Override
    public void update(EstadoLocalDTO estadoLocalDTO) {
        EstadoLocalEntity estadoLocalEntity = estadoLocalRepository.findById(estadoLocalDTO.getEstadoLocalId()).orElse(null);

        if (estadoLocalEntity==null){
            throw new IllegalArgumentException("Id is null");
        }

        estadoLocalEntity = estadoLocalMapper.estadoLocalDTOToEstadoLocalEntity(estadoLocalDTO);
        estadoLocalMapper.estadoLocalEntityToEstadoLocalDTO(estadoLocalRepository.save(estadoLocalEntity));
    }
}
