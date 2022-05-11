package com.oesia.apertura.demo.estadolocalidioma.model;

import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstadoLocalIdiomaDTO {

    private Long estadoLocalIdiomaId;
    private EstadoLocalDTO estadoLocalId;
    private String nombre;
    private IdiomaDTO idiomaId;
}
