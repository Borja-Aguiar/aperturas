package com.oesia.apertura.demo.tipoproyectoidioma.service.implementacion;

import com.oesia.apertura.demo.tipoproyectoidioma.repository.TipoProyectoIdiomaRepository;
import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.DeleteTipoProyectoIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteTipoProyectoIdiomaImpl implements DeleteTipoProyectoIdiomaInterface {
    @Autowired
    private TipoProyectoIdiomaRepository tipoProyectoIdiomaRepository;

    @Override
    public void deleteById(long idTipoProyectoIdioma) {
        tipoProyectoIdiomaRepository.deleteById(idTipoProyectoIdioma);
    }
}
