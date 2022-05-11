package com.oesia.apertura.demo.obraidioma.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateObraIdiomaDTO {

    private Long obraIdiomaId;

    private Long obraId;

    private Long tipoProyectoId;

    private Long estadoLocalId;

    private Long alcanceObraId;

    private Long estadoProyectoId;

    private Long idiomaId;
}
