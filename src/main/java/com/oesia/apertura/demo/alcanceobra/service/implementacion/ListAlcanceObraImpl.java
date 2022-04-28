package com.oesia.apertura.demo.alcanceobra.service.implementacion;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.alcanceobra.mapper.AlcanceObraMapper;
import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.repository.AlcanceObraRepository;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.ListAlcanceObraInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListAlcanceObraImpl implements ListAlcanceObraInterface {

    @Autowired
    private AlcanceObraRepository alcanceObraRepository;

    @Autowired
    private AlcanceObraMapper alcanceObraMapper;

    @Override
    public List<AlcanceObraDTO> list() {
        List<AlcanceObraEntity> alcanceObraEntities = alcanceObraRepository.findAll();

        List<AlcanceObraDTO> alcanceObraDTOS = new ArrayList<>();

        for (AlcanceObraEntity alcanceObraEntity : alcanceObraEntities) {
            alcanceObraDTOS.add(alcanceObraMapper.alcanceObraEntityToAlcanceObraDTO(alcanceObraEntity));
        }
        return alcanceObraDTOS;
    }
}
