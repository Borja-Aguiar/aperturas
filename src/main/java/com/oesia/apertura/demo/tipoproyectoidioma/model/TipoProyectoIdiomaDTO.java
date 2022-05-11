package com.oesia.apertura.demo.tipoproyectoidioma.model;

import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import com.oesia.apertura.demo.tipoproyecto.model.TipoProyectoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoProyectoIdiomaDTO {

    private Long tipoProyectoIdiomaId;
    private TipoProyectoDTO tipoProyectoId;
    private String nombre;
    private IdiomaDTO idiomaId;
}
