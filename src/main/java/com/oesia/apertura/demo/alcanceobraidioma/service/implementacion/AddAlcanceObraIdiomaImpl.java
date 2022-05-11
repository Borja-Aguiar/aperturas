package com.oesia.apertura.demo.alcanceobraidioma.service.implementacion;

import com.oesia.apertura.demo.alcanceobraidioma.entities.AlcanceObraIdiomaEntity;
import com.oesia.apertura.demo.alcanceobraidioma.mapper.AlcanceObraIdiomaMapper;
import com.oesia.apertura.demo.alcanceobraidioma.model.AddAlcanceObraIdiomaDTO;
import com.oesia.apertura.demo.alcanceobraidioma.repository.AlcanceObraIdiomaRepository;
import com.oesia.apertura.demo.alcanceobraidioma.service.interfaz.AddAlcanceObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddAlcanceObraIdiomaImpl implements AddAlcanceObraIdiomaInterface {

    @Autowired
    private AlcanceObraIdiomaRepository alcanceObraIdiomaRepository;

    @Autowired
    private AlcanceObraIdiomaMapper alcanceObraIdiomaMapper;

    @Override
    public void add(AddAlcanceObraIdiomaDTO addAlcanceObraIdiomaDTO) {
        AlcanceObraIdiomaEntity alcanceObraIdiomaEntity = alcanceObraIdiomaMapper.addAlcanceObraIdiomaDTOToAlcanceObraIdiomaEntity(addAlcanceObraIdiomaDTO);
        alcanceObraIdiomaRepository.save(alcanceObraIdiomaEntity);
    }
}
