package com.oesia.apertura.demo.obraidioma.service.implementacion;

import com.oesia.apertura.demo.obraidioma.entities.ObraIdiomaEntity;
import com.oesia.apertura.demo.obraidioma.mapper.ObraIdiomaMapper;
import com.oesia.apertura.demo.obraidioma.model.ObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.repository.ObraIdiomaRepository;
import com.oesia.apertura.demo.obraidioma.service.interfaz.ListObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListObraIdiomaImpl implements ListObraIdiomaInterface {

    @Autowired
    private ObraIdiomaRepository obraIdiomaRepository;

    @Autowired
    private ObraIdiomaMapper obraIdiomaMapper;

    @Override
    public List<ObraIdiomaDTO> list() {
        List<ObraIdiomaEntity> obraIdiomaEntities = obraIdiomaRepository.findAll();

        List<ObraIdiomaDTO> obraIdiomaDTOS = new ArrayList<>();

        for (ObraIdiomaEntity obraIdiomaEntity : obraIdiomaEntities) {
            obraIdiomaDTOS.add(obraIdiomaMapper.obraIdiomaEntityToObraIdiomaDTO(obraIdiomaEntity));
        }
        return obraIdiomaDTOS;
    }
}
