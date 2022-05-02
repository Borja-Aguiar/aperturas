package com.oesia.apertura.demo.obra.service.implementacion;

import com.oesia.apertura.demo.obra.entities.ObraEntity;
import com.oesia.apertura.demo.obra.mapper.ObraMapper;
import com.oesia.apertura.demo.obra.model.AddObraDTO;
import com.oesia.apertura.demo.obra.repository.ObraRepository;
import com.oesia.apertura.demo.obra.service.interfaz.AddObraInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddObraImpl implements AddObraInterface {

    @Autowired
    private ObraRepository obraRepository;

    @Autowired
    private ObraMapper obraMapper;

    @Override
    public void add(AddObraDTO addObraDTO) {
        ObraEntity obraEntity = obraMapper.addObraDTOToObraEntity(addObraDTO);
        obraRepository.save(obraEntity);
    }
}
