package com.oesia.apertura.demo.obra.service.implementacion;

import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadolocal.mapper.EstadoLocalMapper;
import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.repository.EstadoLocalRepository;
import com.oesia.apertura.demo.obra.entities.ObraEntity;
import com.oesia.apertura.demo.obra.mapper.ObraMapper;
import com.oesia.apertura.demo.obra.model.ObraDTO;
import com.oesia.apertura.demo.obra.repository.ObraRepository;
import com.oesia.apertura.demo.obra.service.interfaz.FindObraInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class FindObraImpl implements FindObraInterface {

    @Autowired
    private ObraRepository obraRepository;

    @Autowired
    private ObraMapper obraMapper;

    @Override
    public ObraDTO findEstadoLocalById(Long idObra) {
        ObraEntity obraEntity = obraRepository.findById(idObra).orElse(null);
        if (obraEntity == null) {
            throw new IllegalArgumentException("EstadoLocal id is null");
        }

        return obraMapper.obraEntityToObraDTO(obraEntity);
    }
}
