package com.oesia.apertura.demo.idioma.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Idioma")
public class IdiomaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdiomaId", unique = true, nullable = false)
    private Long idiomaId;

    @Column(name = "DescripcionIdioma", nullable = false)
    private String descripcion;
}
