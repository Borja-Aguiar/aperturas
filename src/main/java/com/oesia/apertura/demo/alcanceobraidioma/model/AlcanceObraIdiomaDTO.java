package com.oesia.apertura.demo.alcanceobraidioma.model;

import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlcanceObraIdiomaDTO {

    private Long alcanceObraIdiomaId;
    private AlcanceObraDTO alcanceObraId;
    private String nombre;
    private IdiomaDTO idiomaId;
}
