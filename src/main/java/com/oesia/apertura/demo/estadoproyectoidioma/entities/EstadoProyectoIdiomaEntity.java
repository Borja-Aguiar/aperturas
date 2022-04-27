package com.oesia.apertura.demo.estadoproyectoidioma.entities;

import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "EstadoProyectoIdioma")
public class EstadoProyectoIdiomaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EstadoProyectoIdiomaId", unique = true, nullable = false)
    private Long estadoProyectoIdiomaId;

    @ManyToOne
    @JoinColumn(name = "EstadoProyectoId", nullable = false)
    private EstadoProyectoEntity estadoProyectoEntity;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "IdiomaId", nullable = false)
    private IdiomaEntity idiomaEntity;

}
