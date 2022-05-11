package com.oesia.apertura.demo.obraidioma.entities;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.idioma.entities.IdiomaEntity;
import com.oesia.apertura.demo.obra.entities.ObraEntity;
import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ObraIdioma")
public class ObraIdiomaEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ObraIdiomaId", unique = true, nullable = false)
    private Long obraIdiomaId;

    @ManyToOne
    @JoinColumn(name = "ObraId", nullable = false)
    private ObraEntity obraEntity;

    @ManyToOne
    @JoinColumn(name = "TipoProyectoId", nullable = false)
    private TipoProyectoEntity tipoProyectoEntity;

    @ManyToOne
    @JoinColumn(name = "EstadoLocalId", nullable = false)
    private EstadoLocalEntity estadoLocalEntity;

    @ManyToOne
    @JoinColumn(name = "AlcanceObraId", nullable = false)
    private AlcanceObraEntity alcanceObraEntity;

    @ManyToOne
    @JoinColumn(name = "EstadoProyectoId", nullable = false)
    private EstadoProyectoEntity estadoProyectoEntity;

    @ManyToOne
    @JoinColumn(name = "IdiomaId", nullable = false)
    private IdiomaEntity idiomaEntity;

// Tienda

    @Column(name = "FInicioObra", nullable = false)
    private Date fInicioObra;

    @Column(name = "FLinea", nullable = false)
    private Date fLinea;

    @Column(name = "FPrevistaFin", nullable = false)
    private Date fPrevistaFin;

    @Column(name = "FApertura", nullable = false)
    private Date fApertura;

    @Column(name = "Nombre", nullable = false)
    private String nombre;
}
