package com.oesia.apertura.demo.estadoproyectoidioma.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEstadoProyectoIdiomaDTO {

    private Long estadoProyectoId;
    private String nombre;
    private Long idiomaId;
}
