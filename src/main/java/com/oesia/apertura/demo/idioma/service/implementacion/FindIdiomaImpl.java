package com.oesia.apertura.demo.idioma.service.implementacion;

import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import com.oesia.apertura.demo.idioma.mapper.IdiomaMapper;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import com.oesia.apertura.demo.idioma.repository.IdiomaRepository;
import com.oesia.apertura.demo.idioma.service.interfaz.FindIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindIdiomaImpl implements FindIdiomaInterface {
    @Autowired
    private IdiomaRepository idiomaRepository;

    @Autowired
    private IdiomaMapper idiomaMapper;

    @Override
    public IdiomaDTO findById(long idIdioma) {
        IdiomaEntity idiomaEntity = idiomaRepository.findById(idIdioma).orElse(null);
        if (idiomaEntity == null) {
            throw new IllegalArgumentException("The Idioma id is null");
        }
        return idiomaMapper.IdiomaEntityToIdiomaDTO(idiomaEntity);
    }
}
