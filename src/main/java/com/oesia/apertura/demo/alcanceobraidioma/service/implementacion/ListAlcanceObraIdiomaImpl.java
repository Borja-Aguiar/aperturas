package com.oesia.apertura.demo.alcanceobraidioma.service.implementacion;

import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobraidioma.entities.AlcanceObraIdiomaEntity;
import com.oesia.apertura.demo.alcanceobraidioma.mapper.AlcanceObraIdiomaMapper;
import com.oesia.apertura.demo.alcanceobraidioma.model.AlcanceObraIdiomaDTO;
import com.oesia.apertura.demo.alcanceobraidioma.repository.AlcanceObraIdiomaRepository;
import com.oesia.apertura.demo.alcanceobraidioma.service.interfaz.ListAlcanceObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListAlcanceObraIdiomaImpl implements ListAlcanceObraIdiomaInterface {

    @Autowired
    private AlcanceObraIdiomaRepository alcanceObraIdiomaRepository;

    @Autowired
    private AlcanceObraIdiomaMapper alcanceObraIdiomaMapper;

    @Override
    public List<AlcanceObraIdiomaDTO> list() {
        List<AlcanceObraIdiomaEntity> alcanceObraIdiomaEntities = alcanceObraIdiomaRepository.findAll();

        List<AlcanceObraIdiomaDTO> alcanceObraIdiomaDTOS = new ArrayList<>();

        for (AlcanceObraIdiomaEntity alcanceObraIdiomaEntity : alcanceObraIdiomaEntities) {
            alcanceObraIdiomaDTOS.add(alcanceObraIdiomaMapper.alcanceObraIdiomaEntityToAlcanceObraIdiomaDTO(alcanceObraIdiomaEntity));
        }

        return alcanceObraIdiomaDTOS;
    }
}
