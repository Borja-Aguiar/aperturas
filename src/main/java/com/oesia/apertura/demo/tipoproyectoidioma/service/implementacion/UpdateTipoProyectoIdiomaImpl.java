package com.oesia.apertura.demo.tipoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.obra.entities.ObraEntity;
import com.oesia.apertura.demo.obra.model.UpdateObraDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.entities.TipoProyectoIdiomaEntity;
import com.oesia.apertura.demo.tipoproyectoidioma.mapper.TipoProyectoIdiomaMapper;
import com.oesia.apertura.demo.tipoproyectoidioma.model.TipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.model.UpdateTipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.repository.TipoProyectoIdiomaRepository;
import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.UpdateTipoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateTipoProyectoIdiomaImpl implements UpdateTipoProyectoIdiomaInterface {
    @Autowired
    private TipoProyectoIdiomaMapper tipoProyectoIdiomaMapper;

    @Autowired
    private TipoProyectoIdiomaRepository tipoProyectoIdiomaRepository;

    @Override
    public void update(UpdateTipoProyectoIdiomaDTO updateTipoProyectoIdiomaDTO) {
        TipoProyectoIdiomaEntity tipoProyectoIdiomaEntity= tipoProyectoIdiomaRepository.findById(updateTipoProyectoIdiomaDTO.getTipoProyectoIdiomaId()).orElse(null);

        if (tipoProyectoIdiomaEntity == null) {
            throw new IllegalArgumentException("Id is null");
        }

        tipoProyectoIdiomaEntity = tipoProyectoIdiomaMapper.updateTipoProyectoIdiomaDTOToTipoProyectoIdiomaEntity(updateTipoProyectoIdiomaDTO);
        tipoProyectoIdiomaMapper.tipoProyectoIdiomaEntityToTipoProyectoIdiomaDTO(tipoProyectoIdiomaRepository.save(tipoProyectoIdiomaEntity));

    }
}
