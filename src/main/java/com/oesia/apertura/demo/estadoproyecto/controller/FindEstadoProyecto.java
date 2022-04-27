package com.oesia.apertura.demo.estadoproyecto.controller;

import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.DeleteEstadoProyectoInterface;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.FindEstadoProyectoInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadoproyecto")
@Api(tags = "EstadoProyecto")
public class FindEstadoProyecto {

    @Autowired
    private FindEstadoProyectoInterface findEstadoProyectoInterface;

    @GetMapping("/listEstadoProyecto/{idEstadoProyecto}")
    @ApiOperation(value = "FindEstadoProyectoController--Find EstadoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<EstadoProyectoDTO> findEstadoProyectoById(
            @ApiParam(value = "parameterized id", name = "idEstadoProyecto", example = "1", required = true) @PathVariable final Long idEstadoProyecto) {
        try {
            findEstadoProyectoInterface.findById(idEstadoProyecto);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
