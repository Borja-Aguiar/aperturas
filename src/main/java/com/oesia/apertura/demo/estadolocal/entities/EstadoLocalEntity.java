package com.oesia.apertura.demo.estadolocal.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "EstadoLocal")
public class EstadoLocalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EstadoLocalId", unique = true, nullable = false)
    private Long estadoLocalId;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

}
