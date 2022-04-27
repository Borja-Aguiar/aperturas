package com.oesia.apertura.demo.alcanceobra.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AlcanceObra")
public class AlcanceObraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AlcanceObraId", unique = true, nullable = false)
    private Long alcanceObraId;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

}
