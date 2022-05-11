package com.oesia.apertura.demo.alcanceobraidioma.service.implementacion;

import com.oesia.apertura.demo.alcanceobraidioma.entities.AlcanceObraIdiomaEntity;
import com.oesia.apertura.demo.alcanceobraidioma.mapper.AlcanceObraIdiomaMapper;
import com.oesia.apertura.demo.alcanceobraidioma.model.AlcanceObraIdiomaDTO;
import com.oesia.apertura.demo.alcanceobraidioma.repository.AlcanceObraIdiomaRepository;
import com.oesia.apertura.demo.alcanceobraidioma.service.interfaz.FindAlcanceObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindAlcanceObraIdiomaImpl implements FindAlcanceObraIdiomaInterface {

    @Autowired
    private AlcanceObraIdiomaRepository alcanceObraIdiomaRepository;

    @Autowired
    private AlcanceObraIdiomaMapper alcanceObraIdiomaMapper;

    @Override
    public AlcanceObraIdiomaDTO findAlcanceObraById(Long idAlcanceObraIdioma) {
        AlcanceObraIdiomaEntity alcanceObraIdiomaEntity = alcanceObraIdiomaRepository.findById(idAlcanceObraIdioma).orElse(null);
        if (alcanceObraIdiomaEntity == null) {
            throw new IllegalArgumentException("AlcanceObraIdioma id is null");
        }

        return alcanceObraIdiomaMapper.alcanceObraIdiomaEntityToAlcanceObraIdiomaDTO(alcanceObraIdiomaEntity);
    }
}
