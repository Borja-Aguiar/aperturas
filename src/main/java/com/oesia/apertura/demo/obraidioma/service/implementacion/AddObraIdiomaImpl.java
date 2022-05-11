package com.oesia.apertura.demo.obraidioma.service.implementacion;

import com.oesia.apertura.demo.obraidioma.entities.ObraIdiomaEntity;
import com.oesia.apertura.demo.obraidioma.mapper.ObraIdiomaMapper;
import com.oesia.apertura.demo.obraidioma.model.AddObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.repository.ObraIdiomaRepository;
import com.oesia.apertura.demo.obraidioma.service.interfaz.AddObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddObraIdiomaImpl implements AddObraIdiomaInterface {

    @Autowired
    private ObraIdiomaRepository obraIdiomaRepository;

    @Autowired
    private ObraIdiomaMapper obraIdiomaMapper;

    @Override
    public void add(AddObraIdiomaDTO addObraIdiomaDTO) {
        ObraIdiomaEntity obraIdiomaEntity = obraIdiomaMapper.addObraIdiomaDTOToObraIdiomaEntity(addObraIdiomaDTO);
        obraIdiomaRepository.save(obraIdiomaEntity);

    }
}
