package com.oesia.apertura.demo.alcanceobraidioma.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddAlcanceObraIdiomaDTO {

    private Long alcanceObraId;
    private String nombre;
    private Long idiomaId;
}
