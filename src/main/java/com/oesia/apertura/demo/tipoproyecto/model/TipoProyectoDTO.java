package com.oesia.apertura.demo.tipoproyecto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoProyectoDTO {

    private Long tipoProyectoId;
    private String nombre;
}
