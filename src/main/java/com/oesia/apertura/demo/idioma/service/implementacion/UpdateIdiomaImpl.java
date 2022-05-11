package com.oesia.apertura.demo.idioma.service.implementacion;

import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import com.oesia.apertura.demo.idioma.mapper.IdiomaMapper;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import com.oesia.apertura.demo.idioma.repository.IdiomaRepository;
import com.oesia.apertura.demo.idioma.service.interfaz.UpdateIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateIdiomaImpl implements UpdateIdiomaInterface {

    @Autowired
    private IdiomaRepository idiomaRepository;

    @Autowired
    private IdiomaMapper idiomaMapper;

    @Override
    public void update(IdiomaDTO idiomaDTO) {
        IdiomaEntity idiomaEntity = idiomaRepository.findById(idiomaDTO.getIdiomaId()).orElse(null);

        if (idiomaEntity == null) {
            throw new IllegalArgumentException("Id is null");
        }

        idiomaEntity = idiomaMapper.IdiomaDTOToIdiomaEntity(idiomaDTO);
        idiomaMapper.IdiomaEntityToIdiomaDTO(idiomaRepository.save(idiomaEntity));
    }
}
