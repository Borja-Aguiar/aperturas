package com.oesia.apertura.demo.tipoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.tipoproyectoidioma.entities.TipoProyectoIdiomaEntity;
import com.oesia.apertura.demo.tipoproyectoidioma.mapper.TipoProyectoIdiomaMapper;
import com.oesia.apertura.demo.tipoproyectoidioma.model.TipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.repository.TipoProyectoIdiomaRepository;
import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.ListTipoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListTipoProyectoIdiomaImpl implements ListTipoProyectoIdiomaInterface {
    @Autowired
    private TipoProyectoIdiomaRepository tipoProyectoIdiomaRepository;

    @Autowired
    private TipoProyectoIdiomaMapper tipoProyectoIdiomaMapper;

    @Override
    public List<TipoProyectoIdiomaDTO> list() {
        List<TipoProyectoIdiomaEntity> tipoProyectoIdiomaEntities = tipoProyectoIdiomaRepository.findAll();

        List<TipoProyectoIdiomaDTO> tipoProyectoIdiomaDTOS = new ArrayList<>();

        for (TipoProyectoIdiomaEntity tipoProyectoIdiomaEntity : tipoProyectoIdiomaEntities) {
            tipoProyectoIdiomaDTOS.add(tipoProyectoIdiomaMapper.tipoProyectoIdiomaEntityToTipoProyectoIdiomaDTO(tipoProyectoIdiomaEntity));
        }
        return tipoProyectoIdiomaDTOS;
    }
}
