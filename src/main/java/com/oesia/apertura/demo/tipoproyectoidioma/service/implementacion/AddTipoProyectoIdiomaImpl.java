package com.oesia.apertura.demo.tipoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.tipoproyectoidioma.entities.TipoProyectoIdiomaEntity;
import com.oesia.apertura.demo.tipoproyectoidioma.mapper.TipoProyectoIdiomaMapper;
import com.oesia.apertura.demo.tipoproyectoidioma.model.AddTipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.repository.TipoProyectoIdiomaRepository;
import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.AddTipoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddTipoProyectoIdiomaImpl implements AddTipoProyectoIdiomaInterface{
    @Autowired
    private TipoProyectoIdiomaRepository tipoProyectoIdiomaRepository;

    @Autowired
    private TipoProyectoIdiomaMapper tipoProyectoIdiomaMapper;

    @Override
    public void add(AddTipoProyectoIdiomaDTO addTipoProyectoIdiomaDTO) {
        TipoProyectoIdiomaEntity tipoProyectoIdiomaEntity = tipoProyectoIdiomaMapper.addTipoProyectoIdiomaDTOToTipoProyectoIdiomaEntity(addTipoProyectoIdiomaDTO);
        tipoProyectoIdiomaRepository.save(tipoProyectoIdiomaEntity);

    }
}
