package com.oesia.apertura.demo.obra.entities;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Obra")
public class ObraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ObraId", unique = true, nullable = false)
    private Long obraId;

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

    //ToDo tienda

    @Column(name = "FInicioObra", nullable = false)
    private Date fInicioObra;

    @Column(name = "FLinea", nullable = false)
    private Date fLinea;

    @Column(name = "FPrevistaFin", nullable = false)
    private Date fPrevistaFin;

    @Column(name = "FApertura", nullable = false)
    private Date fApertura;

}
