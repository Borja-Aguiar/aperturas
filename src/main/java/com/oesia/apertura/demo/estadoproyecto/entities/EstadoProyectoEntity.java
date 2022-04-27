package com.oesia.apertura.demo.estadoproyecto.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "estadoproyecto")
public class EstadoProyectoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EstadoProyectoId", unique = true, nullable = false)
    private Long estadoProyectoId;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

}
