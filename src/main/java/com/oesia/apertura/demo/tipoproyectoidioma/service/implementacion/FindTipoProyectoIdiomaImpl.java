package com.oesia.apertura.demo.tipoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.tipoproyectoidioma.entities.TipoProyectoIdiomaEntity;
import com.oesia.apertura.demo.tipoproyectoidioma.mapper.TipoProyectoIdiomaMapper;
import com.oesia.apertura.demo.tipoproyectoidioma.model.TipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.repository.TipoProyectoIdiomaRepository;
import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.FindTipoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindTipoProyectoIdiomaImpl implements FindTipoProyectoIdiomaInterface {
    @Autowired
    private TipoProyectoIdiomaRepository tipoProyectoIdiomaRepository;

    @Autowired
    private TipoProyectoIdiomaMapper tipoProyectoIdiomaMapper;

    @Override
    public TipoProyectoIdiomaDTO findById(long idTipoProyectoIdioma) {

        TipoProyectoIdiomaEntity tipoProyectoIdiomaEntity = tipoProyectoIdiomaRepository.findById(idTipoProyectoIdioma).orElse(null);
        if (tipoProyectoIdiomaEntity == null) {
            throw new IllegalArgumentException("The TipoProyectoIdioma id is null");
        }
        return tipoProyectoIdiomaMapper.tipoProyectoIdiomaEntityToTipoProyectoIdiomaDTO(tipoProyectoIdiomaEntity);
    }
}
