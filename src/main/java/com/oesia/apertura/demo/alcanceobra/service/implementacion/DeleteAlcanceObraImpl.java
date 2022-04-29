package com.oesia.apertura.demo.alcanceobra.service.implementacion;

import com.oesia.apertura.demo.alcanceobra.repository.AlcanceObraRepository;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.DeleteAlcanceObraInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteAlcanceObraImpl implements DeleteAlcanceObraInterface{

    @Autowired
    private AlcanceObraRepository alcanceObraRepository;

    @Override
    public void deleteById(long idAlcanceObra) {
        alcanceObraRepository.deleteById(idAlcanceObra);
    }
}
