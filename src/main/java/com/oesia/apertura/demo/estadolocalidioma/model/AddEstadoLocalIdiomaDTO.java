package com.oesia.apertura.demo.estadolocalidioma.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEstadoLocalIdiomaDTO {

    private Long estadoLocalId;
    private String nombre;
    private Long idiomaId;
}
