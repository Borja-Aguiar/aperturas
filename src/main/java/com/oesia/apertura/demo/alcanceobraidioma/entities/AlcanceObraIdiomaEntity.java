package com.oesia.apertura.demo.alcanceobraidioma.entities;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "AlcanceObraIdioma")
public class AlcanceObraIdiomaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AlcanceObraIdiomaId", unique = true, nullable = false)
    private Long alcanceObraIdiomaId;

    @ManyToOne
    @JoinColumn(name = "AlcanceObraId", nullable = false)
    private AlcanceObraEntity alcanceObraEntity;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "IdiomaId", nullable = false)
    private IdiomaEntity idiomaEntity;
}
