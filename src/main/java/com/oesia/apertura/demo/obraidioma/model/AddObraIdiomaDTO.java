package com.oesia.apertura.demo.obraidioma.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddObraIdiomaDTO {

        private Long obraId;

        private Long tipoProyectoId;

        private Long estadoLocalId;

        private Long alcanceObraId;

        private Long estadoProyectoId;

        private Long idiomaId;

// Tienda

        private Date fInicioObra;

        private Date fLinea;

        private Date fPrevistaFin;

        private Date fApertura;

        private String nombre;

    }
