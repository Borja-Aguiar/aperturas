package com.oesia.apertura.demo.obraidioma.service.implementacion;

import com.oesia.apertura.demo.obraidioma.entities.ObraIdiomaEntity;
import com.oesia.apertura.demo.obraidioma.mapper.ObraIdiomaMapper;
import com.oesia.apertura.demo.obraidioma.model.ObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.repository.ObraIdiomaRepository;
import com.oesia.apertura.demo.obraidioma.service.interfaz.FindObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindObraIdiomaImpl implements FindObraIdiomaInterface {

    @Autowired
    private ObraIdiomaRepository obraIdiomaRepository;

    @Autowired
    private ObraIdiomaMapper obraIdiomaMapper;

    @Override
    public ObraIdiomaDTO findObraIdiomaById(Long idObraIdioma) {
        ObraIdiomaEntity obraIdiomaEntity = obraIdiomaRepository.findById(idObraIdioma).orElse(null);
        if (obraIdiomaEntity == null) {
            throw new IllegalArgumentException("The ObraIdioma id is null");
        }
        return obraIdiomaMapper.obraIdiomaEntityToObraIdiomaDTO(obraIdiomaEntity);
    }
}
