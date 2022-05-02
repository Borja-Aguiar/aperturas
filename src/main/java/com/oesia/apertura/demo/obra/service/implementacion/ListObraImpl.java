package com.oesia.apertura.demo.obra.service.implementacion;

import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.obra.entities.ObraEntity;
import com.oesia.apertura.demo.obra.mapper.ObraMapper;
import com.oesia.apertura.demo.obra.model.ObraDTO;
import com.oesia.apertura.demo.obra.repository.ObraRepository;
import com.oesia.apertura.demo.obra.service.interfaz.ListObraInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ListObraImpl implements ListObraInterface {

   @Autowired
   private ObraRepository obraRepository;

   @Autowired
   private ObraMapper obraMapper;

    @Override
    public List<ObraDTO> list() {
        List<ObraEntity> obraEntities = obraRepository.findAll();

        List<ObraDTO> obraDTOS = new ArrayList<>();

        for (ObraEntity obraEntity : obraEntities) {
            obraDTOS.add(obraMapper.obraEntityToObraDTO(obraEntity));
        }

        return obraDTOS;
    }
}
