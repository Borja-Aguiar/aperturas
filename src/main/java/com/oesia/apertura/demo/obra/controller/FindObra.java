package com.oesia.apertura.demo.obra.controller;

import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.obra.model.ObraDTO;
import com.oesia.apertura.demo.obra.service.interfaz.FindObraInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/obra")
@Api(tags = "Obra")
public class FindObra {

    @Autowired
    private FindObraInterface findObraInterface;

    @GetMapping("/find/{idObra}")
    @ApiOperation(value = "FindObra--Find Obra")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<ObraDTO> findObraById(
            @ApiParam(value = "parameterized id", name = "idObra", example = "1", required = true) @PathVariable final Long idObra) {
        try {
            ObraDTO obraDTO = findObraInterface.findEstadoLocalById(idObra);
            return new ResponseEntity<>(obraDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
