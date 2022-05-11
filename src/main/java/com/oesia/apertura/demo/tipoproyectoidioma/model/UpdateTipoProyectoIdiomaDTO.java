package com.oesia.apertura.demo.tipoproyectoidioma.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTipoProyectoIdiomaDTO {

    private Long tipoProyectoIdiomaId;
    private Long tipoProyectoId;
    private String nombre;
    private Long idiomaId;
}
