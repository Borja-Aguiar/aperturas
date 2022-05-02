package com.oesia.apertura.demo.obra.service.implementacion;

import com.oesia.apertura.demo.obra.repository.ObraRepository;
import com.oesia.apertura.demo.obra.service.interfaz.DeleteObraInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteObraImpl implements DeleteObraInterface {

    @Autowired
    private ObraRepository obraRepository;

    @Override
    public void deleteById(long idObra) {obraRepository.deleteById(idObra);}
}
