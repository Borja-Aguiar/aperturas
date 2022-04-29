package com.oesia.apertura.demo.alcanceobra.service.implementacion;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.alcanceobra.mapper.AlcanceObraMapper;
import com.oesia.apertura.demo.alcanceobra.model.AddAlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.repository.AlcanceObraRepository;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.AddAlcanceObraInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddAlcanceObraImpl implements AddAlcanceObraInterface {

    @Autowired
    private AlcanceObraRepository alcanceObraRepository;

    @Autowired
    private AlcanceObraMapper alcanceObraMapper;

    @Override
    public void add(AddAlcanceObraDTO addAlcanceObraDTO) {
        AlcanceObraEntity alcanceObraEntity = alcanceObraMapper.addAlcanceObraDTOToAlcanceObraEntity(addAlcanceObraDTO);
        alcanceObraRepository.save(alcanceObraEntity);

    }
}
