package com.oesia.apertura.demo.obra.service.interfaz;

import com.oesia.apertura.demo.obra.model.AddObraDTO;
import com.oesia.apertura.demo.obra.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface AddObraInterface {
    void add(AddObraDTO addObraDTO);
}
