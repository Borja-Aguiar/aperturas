package com.oesia.apertura.demo.tipoproyecto.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TipoProyecto")
public class TipoProyectoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TipoProyectoId", unique = true, nullable = false)
    private Long tipoProyectolId;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

}
