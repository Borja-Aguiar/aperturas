package com.oesia.apertura.demo.obra.service.implementacion;

import com.oesia.apertura.demo.obra.entities.ObraEntity;
import com.oesia.apertura.demo.obra.mapper.ObraMapper;
import com.oesia.apertura.demo.obra.model.UpdateObraDTO;
import com.oesia.apertura.demo.obra.repository.ObraRepository;
import com.oesia.apertura.demo.obra.service.interfaz.UpdateObraInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateObraImpl implements UpdateObraInterface {

    @Autowired
    private ObraMapper obraMapper;

    @Autowired
    private ObraRepository obraRepository;

    @Override
    public void update(UpdateObraDTO updateObraDTO) {
        ObraEntity obraEntity = obraRepository.findById(updateObraDTO.getObraId()).orElse(null);

        if (obraEntity == null) {
            throw new IllegalArgumentException("Id is null");
        }

        obraEntity = obraMapper.updateObraDTOToObraEntity(updateObraDTO);
        obraMapper.obraEntityToObraDTO(obraRepository.save(obraEntity));
    }
}
