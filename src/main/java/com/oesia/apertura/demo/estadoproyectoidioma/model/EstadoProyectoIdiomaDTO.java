package com.oesia.apertura.demo.estadoproyectoidioma.model;

import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstadoProyectoIdiomaDTO {

    private Long estadoProyectoIdiomaId;
    private EstadoProyectoDTO estadoProyectoId;
    private String nombre;
    private IdiomaDTO idiomaId;
}
