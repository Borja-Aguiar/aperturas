package com.oesia.apertura.demo.obraidioma.service.implementacion;

import com.oesia.apertura.demo.obraidioma.repository.ObraIdiomaRepository;
import com.oesia.apertura.demo.obraidioma.service.interfaz.DeleteObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteObraIdiomaImpl implements DeleteObraIdiomaInterface {

    @Autowired
    private ObraIdiomaRepository obraIdiomaRepository;

    @Override
    public void deleteById(Long idObraIdioma) {
        obraIdiomaRepository.deleteById(idObraIdioma);
    }
}
