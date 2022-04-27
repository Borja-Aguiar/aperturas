package com.oesia.apertura.demo.estadolocalidioma.entities;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "EstadoLocalIdioma")
public class EstadoLocalIdiomaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EstadoLocalIdiomaId", unique = true, nullable = false)
    private Long estadoLocalIdiomaId;

    @ManyToOne
    @JoinColumn(name = "EstadoLocalId", nullable = false)
    private EstadoLocalEntity estadoLocalEntity;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "IdiomaId", nullable = false)
    private IdiomaEntity idiomaEntity;

}
