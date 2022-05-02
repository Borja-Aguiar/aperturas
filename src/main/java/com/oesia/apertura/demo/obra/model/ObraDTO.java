package com.oesia.apertura.demo.obra.model;

import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import com.oesia.apertura.demo.tienda.model.TiendaDTO;
import com.oesia.apertura.demo.tipoproyecto.model.TipoProyectoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObraDTO {

    private Long obraId;
    private TipoProyectoDTO tipoProyectoId;
    private EstadoLocalDTO estadoLocalId;
    private AlcanceObraDTO alcanceObraId;
    private EstadoProyectoDTO estadoProyectoId;
    private TiendaDTO tiendaId;
    private Date fInicioObra;
    private Date fLinea;
    private Date fPrevistaFin;
    private Date fApertura;

}
