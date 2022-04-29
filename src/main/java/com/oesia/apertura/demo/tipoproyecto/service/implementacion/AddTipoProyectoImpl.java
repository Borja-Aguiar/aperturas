package com.oesia.apertura.demo.tipoproyecto.service.implementacion;

import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import com.oesia.apertura.demo.tipoproyecto.mapper.TipoProyectoMapper;
import com.oesia.apertura.demo.tipoproyecto.model.AddTipoProyectoDTO;
import com.oesia.apertura.demo.tipoproyecto.repository.TipoProyectoRepository;
import com.oesia.apertura.demo.tipoproyecto.service.interfaz.AddTipoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddTipoProyectoImpl implements AddTipoProyectoInterface {

    @Autowired
    private TipoProyectoRepository tipoProyectoRepository;

    @Autowired
    private TipoProyectoMapper tipoProyectoMapper;

    @Override
    public void add(AddTipoProyectoDTO addTipoProyectoDTO) {
        TipoProyectoEntity tipoProyectoEntity = tipoProyectoMapper.AddTipoProyectoDtoToTipoProyectoEntity(addTipoProyectoDTO);
        tipoProyectoRepository.save(tipoProyectoEntity);
    }
}
