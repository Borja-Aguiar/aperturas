package com.oesia.apertura.demo.alcanceobraidioma.service.implementacion;

import com.oesia.apertura.demo.alcanceobraidioma.repository.AlcanceObraIdiomaRepository;
import com.oesia.apertura.demo.alcanceobraidioma.service.interfaz.DeleteAlcanceObraIdiomaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteAlcanceObraIdiomaImpl implements DeleteAlcanceObraIdiomaInterface {

    @Autowired
    private AlcanceObraIdiomaRepository alcanceObraIdiomaRepository;

    @Override
    public void deleteById(long idAlcanceObraIdioma) {alcanceObraIdiomaRepository.deleteById(idAlcanceObraIdioma);}
}
