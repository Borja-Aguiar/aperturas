package com.oesia.apertura.demo.alcanceobra.service.implementacion;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.alcanceobra.mapper.AlcanceObraMapper;
import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.repository.AlcanceObraRepository;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.FindAlcanceObraInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindAlcanceObraImpl implements FindAlcanceObraInterface {

    @Autowired
    private AlcanceObraRepository alcanceObraRepository;

    @Autowired
    private AlcanceObraMapper alcanceObraMapper;

    @Override
    public AlcanceObraDTO findById(long idAlcanceObra) {

        AlcanceObraEntity alcanceObraEntity = alcanceObraRepository.findById(idAlcanceObra).orElse(null);
        if (alcanceObraEntity == null) {
            throw new IllegalArgumentException("The AlcanceObra id is null");
        }
        return alcanceObraMapper.alcanceObraEntityToAlcanceObraDTO(alcanceObraEntity);
    }
}
