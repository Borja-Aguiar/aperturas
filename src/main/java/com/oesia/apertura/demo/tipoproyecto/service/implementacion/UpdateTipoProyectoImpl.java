package com.oesia.apertura.demo.tipoproyecto.service.implementacion;

import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import com.oesia.apertura.demo.tipoproyecto.mapper.TipoProyectoMapper;
import com.oesia.apertura.demo.tipoproyecto.model.TipoProyectoDTO;
import com.oesia.apertura.demo.tipoproyecto.repository.TipoProyectoRepository;
import com.oesia.apertura.demo.tipoproyecto.service.interfaz.UpdateTipoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateTipoProyectoImpl implements UpdateTipoProyectoInterface {

    @Autowired
    private TipoProyectoRepository tipoProyectoRepository;

    @Autowired
    private TipoProyectoMapper tipoProyectoMapper;

    @Override
    public void update(TipoProyectoDTO tipoProyectoDTO) {
        TipoProyectoEntity tipoProyectoEntity = tipoProyectoRepository.findById(tipoProyectoDTO.getTipoProyectoId()).orElse(null);

        if (tipoProyectoEntity == null){
            throw new IllegalArgumentException("Id es nulo");
        }

        tipoProyectoEntity = tipoProyectoMapper.tipoProyectoDtotoTipoProyectoEntity(tipoProyectoDTO);
        tipoProyectoMapper.tipoProyectoEntityToTipoProyectoDTO(tipoProyectoRepository.save(tipoProyectoEntity));
    }
}
