package com.oesia.apertura.demo.estadoproyecto.controller;

import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.FindEstadoProyectoInterface;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.ListEstadoProyectoInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estadoproyecto")
@Api(tags = "EstadoProyecto")
public class ListEstadoProyecto {

    @Autowired
    private ListEstadoProyectoInterface listEstadoProyectoInterface;

    @GetMapping("/listEstadoProyecto")
    @ApiOperation(value = "ListEstadoProyectoController--List EstadoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<List<EstadoProyectoDTO>> listEstadoProyectoById(){
        return new ResponseEntity<>(listEstadoProyectoInterface.list(), HttpStatus.OK);
    }

}
