package com.oesia.apertura.demo.alcanceobra.service.implementacion;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.alcanceobra.mapper.AlcanceObraMapper;
import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.repository.AlcanceObraRepository;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.UpdateAlcanceObraInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateAlcanceObraImpl implements UpdateAlcanceObraInterface {

    @Autowired
    private AlcanceObraMapper alcanceObraMapper;

    @Autowired
    private AlcanceObraRepository alcanceObraRepository;

    @Override
    public void update(AlcanceObraDTO alcanceObraDTO) {
        AlcanceObraEntity alcanceObraEntity = alcanceObraRepository.findById(alcanceObraDTO.getAlcanceObraId()).orElse(null);

        if (alcanceObraEntity == null) {
            throw new IllegalArgumentException("Id is null");
        }

        alcanceObraEntity = alcanceObraMapper.alcanceObraDTOToAlcanceObraEntity(alcanceObraDTO);
        alcanceObraMapper.alcanceObraEntityToAlcanceObraDTO(alcanceObraRepository.save(alcanceObraEntity));

    }
}
