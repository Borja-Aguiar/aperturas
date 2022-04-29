package com.oesia.apertura.demo.tipoproyecto.service.implementacion;

import com.oesia.apertura.demo.tienda.mapper.TiendaMapper;
import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import com.oesia.apertura.demo.tipoproyecto.mapper.TipoProyectoMapper;
import com.oesia.apertura.demo.tipoproyecto.model.TipoProyectoDTO;
import com.oesia.apertura.demo.tipoproyecto.repository.TipoProyectoRepository;
import com.oesia.apertura.demo.tipoproyecto.service.interfaz.ListTipoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListTipoProyectoImpl implements ListTipoProyectoInterface {

    @Autowired
    private TipoProyectoMapper tipoProyectoMapper;

    @Autowired
    private TipoProyectoRepository tipoProyectoRepository;


    @Override
    public List<TipoProyectoDTO> list() {
        List<TipoProyectoEntity> listTipoProyectoEntities = tipoProyectoRepository.findAll();
        
        List<TipoProyectoDTO> listTipoProyectoDtos = new ArrayList<>();

        for (TipoProyectoEntity tipoProyectoEntity : listTipoProyectoEntities) {

            listTipoProyectoDtos.add(tipoProyectoMapper.tipoProyectoEntityToTipoProyectoDTO(tipoProyectoEntity));
        }
        return listTipoProyectoDtos;
    }
}
