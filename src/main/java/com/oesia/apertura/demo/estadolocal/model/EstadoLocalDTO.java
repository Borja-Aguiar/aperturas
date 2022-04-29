package com.oesia.apertura.demo.estadolocal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstadoLocalDTO implements Serializable {

    private Long EstadoLocalId;
    private String nombre;
}
