package com.oesia.apertura.demo.tipoproyecto.service.implementacion;

import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import com.oesia.apertura.demo.tipoproyecto.mapper.TipoProyectoMapper;
import com.oesia.apertura.demo.tipoproyecto.model.TipoProyectoDTO;
import com.oesia.apertura.demo.tipoproyecto.repository.TipoProyectoRepository;
import com.oesia.apertura.demo.tipoproyecto.service.interfaz.FindTipoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindTipoProyectoImpl implements FindTipoProyectoInterface {

    @Autowired
    private TipoProyectoRepository tipoProyectoRepository;

    @Autowired
    private TipoProyectoMapper tipoProyectoMapper;

    @Override
    public TipoProyectoDTO findTipoProyectoById(Long idTipoProyecto) {
        TipoProyectoEntity tipoProyectoEntity = tipoProyectoRepository.findById(idTipoProyecto).orElse(null);
        if (tipoProyectoEntity == null){
            throw new IllegalArgumentException("Id no encontrado");
        }
        return tipoProyectoMapper.tipoProyectoEntityToTipoProyectoDTO(tipoProyectoEntity);
    }
}
