package com.oesia.apertura.demo.estadoproyecto.controller;

import com.oesia.apertura.demo.estadoproyecto.model.AddEstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.AddEstadoProyectoInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadoproyecto")
@Api(tags = "EstadoProyecto")
public class AddEstadoProyecto {

    @Autowired
    private AddEstadoProyectoInterface addEstadoProyectoInterface;

    @PostMapping("/add")
    @ApiOperation(value = "AddEstadoProyectoController--Insert EstadoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> addEstadoProyecto(@RequestBody AddEstadoProyectoDTO addEstadoProyectoDTO) {
        addEstadoProyectoInterface.add(addEstadoProyectoDTO);
        return new ResponseEntity<>("Inserted in database correctly", HttpStatus.CREATED);
    }

}
