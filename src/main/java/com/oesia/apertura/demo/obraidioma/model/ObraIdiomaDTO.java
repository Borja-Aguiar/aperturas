package com.oesia.apertura.demo.obraidioma.model;

import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import com.oesia.apertura.demo.obra.model.ObraDTO;
import com.oesia.apertura.demo.tipoproyecto.model.TipoProyectoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObraIdiomaDTO {

    private Long obraIdiomaId;

    private ObraDTO obraId;

    private TipoProyectoDTO tipoProyectoId;

    private EstadoProyectoDTO estadoLocalId;

    private AlcanceObraDTO alcanceObraId;

    private EstadoProyectoDTO estadoProyectoId;

    private IdiomaDTO idiomaId;

// Tienda

    private Date fInicioObra;

    private Date fLinea;

    private Date fPrevistaFin;

    private Date fApertura;

    private String nombre;
}
