package com.oesia.apertura.demo.alcanceobraidioma.service.implementacion;

import com.oesia.apertura.demo.alcanceobraidioma.entities.AlcanceObraIdiomaEntity;
import com.oesia.apertura.demo.alcanceobraidioma.mapper.AlcanceObraIdiomaMapper;
import com.oesia.apertura.demo.alcanceobraidioma.model.UpdateAlcanceObraIdiomaDTO;
import com.oesia.apertura.demo.alcanceobraidioma.repository.AlcanceObraIdiomaRepository;
import com.oesia.apertura.demo.alcanceobraidioma.service.interfaz.UpdateAlcanceObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateAlcanceObraIdiomaImpl implements UpdateAlcanceObraIdiomaInterface {

    @Autowired
    private AlcanceObraIdiomaMapper alcanceObraIdiomaMapper;

    @Autowired
    private AlcanceObraIdiomaRepository alcanceObraIdiomaRepository;

    @Override
    public void update(UpdateAlcanceObraIdiomaDTO updateAlcanceObraIdiomaDTO) {
        AlcanceObraIdiomaEntity alcanceObraIdiomaEntity = alcanceObraIdiomaRepository.findById(updateAlcanceObraIdiomaDTO.getAlcanceObraIdiomaId()).orElse(null);

        if (alcanceObraIdiomaEntity == null) {
            throw new IllegalArgumentException("Id is null");
        }

        alcanceObraIdiomaEntity = alcanceObraIdiomaMapper.updateAlcanceObraIdiomaDTOToAlcanceObraIdiomaEntity(updateAlcanceObraIdiomaDTO);
        alcanceObraIdiomaMapper.alcanceObraIdiomaEntityToAlcanceObraIdiomaDTO(alcanceObraIdiomaRepository.save(alcanceObraIdiomaEntity));
    }
}
