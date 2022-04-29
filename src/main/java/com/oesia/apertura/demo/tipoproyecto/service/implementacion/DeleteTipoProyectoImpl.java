package com.oesia.apertura.demo.tipoproyecto.service.implementacion;

import com.oesia.apertura.demo.tipoproyecto.mapper.TipoProyectoMapper;
import com.oesia.apertura.demo.tipoproyecto.repository.TipoProyectoRepository;
import com.oesia.apertura.demo.tipoproyecto.service.interfaz.DeleteTipoProyectoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteTipoProyectoImpl implements DeleteTipoProyectoInterface {

    @Autowired
    private TipoProyectoRepository tipoProyectoRepository;

    @Override
    public void deleteTipoProyecto(Long idTipoProyecto) {
        tipoProyectoRepository.deleteById(idTipoProyecto);
    }
}
