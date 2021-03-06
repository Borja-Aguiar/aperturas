package com.oesia.apertura.demo.obra.model;

import com.oesia.apertura.demo.alcanceobra.entities.AlcanceObraEntity;
import com.oesia.apertura.demo.estadolocal.entities.EstadoLocalEntity;
import com.oesia.apertura.demo.estadoproyecto.entities.EstadoProyectoEntity;
import com.oesia.apertura.demo.tienda.entities.TiendaEntity;
import com.oesia.apertura.demo.tipoproyecto.entities.TipoProyectoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddObraDTO {

    private Long tipoProyectoId;
    private Long estadoLocalId;
    private Long alcanceObraId;
    private Long estadoProyectoId;
    private Long tiendaId;
    private Date fInicioObra;
    private Date fLinea;
    private Date fPrevistaFin;
    private Date fApertura;

}
