package com.oesia.apertura.demo.estadoproyecto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEstadoProyectoDTO implements Serializable {

    private String nombre;

}
