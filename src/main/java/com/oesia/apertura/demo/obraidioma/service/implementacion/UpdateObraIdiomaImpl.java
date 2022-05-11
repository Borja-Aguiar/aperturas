package com.oesia.apertura.demo.obraidioma.service.implementacion;

import com.oesia.apertura.demo.obraidioma.entities.ObraIdiomaEntity;
import com.oesia.apertura.demo.obraidioma.mapper.ObraIdiomaMapper;
import com.oesia.apertura.demo.obraidioma.model.ObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.model.UpdateObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.repository.ObraIdiomaRepository;
import com.oesia.apertura.demo.obraidioma.service.interfaz.UpdateObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateObraIdiomaImpl implements UpdateObraIdiomaInterface {

    @Autowired
    private ObraIdiomaMapper obraIdiomaMapper;

    @Autowired
    private ObraIdiomaRepository obraIdiomaRepository;

    @Override
    public void update(UpdateObraIdiomaDTO updateObraIdiomaDTO) {
        ObraIdiomaEntity obraIdiomaEntity = obraIdiomaRepository.findById(updateObraIdiomaDTO.getObraIdiomaId()).orElse(null);

        if (obraIdiomaEntity == null) {
            throw new IllegalArgumentException("Id is null");
        }

        obraIdiomaEntity = obraIdiomaMapper.updateObraIdiomaDTOToObraIdiomaEntity(updateObraIdiomaDTO);
        obraIdiomaMapper.obraIdiomaEntityToObraIdiomaDTO(obraIdiomaRepository.save(obraIdiomaEntity));
    }
}
