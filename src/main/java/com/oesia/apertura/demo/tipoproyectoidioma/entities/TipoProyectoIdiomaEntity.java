package com.oesia.apertura.demo.tipoproyectoidioma.entities;

import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TipoProyectoIdioma")
public class TipoProyectoIdiomaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TipoProyectoIdiomaId", unique = true, nullable = false)
    private Long tipoProyectoIdiomaId;

    @ManyToOne
    @JoinColumn(name = "TipoProyectoId", nullable = false)
    private TipoProyectoEntity tipoProyectoEntity;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "IdiomaId", nullable = false)
    private IdiomaEntity idiomaEntity;

}
