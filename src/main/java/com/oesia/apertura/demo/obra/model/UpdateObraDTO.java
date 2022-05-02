package com.oesia.apertura.demo.obra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateObraDTO {

    private Long obraId;
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
