package com.oesia.apertura.demo.estadoproyectoidioma.controller;

import com.oesia.apertura.demo.estadoproyectoidioma.model.AddEstadoProyectoIdiomaDTO;
import com.oesia.apertura.demo.estadoproyectoidioma.service.interfaz.AddEstadoProyectoIdiomaInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadoProyectoIdioma")
@Api(tags = "EstadoProyectoIdioma")
public class AddEstadoProyectoIdioma {

    @Autowired
    private AddEstadoProyectoIdiomaInterface addEstadoProyectoIdiomaInterface;

    @PostMapping("/add")
    @ApiOperation(value = "AddEstadoProyectoIdioma--Insert EstadoProyectoIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> addEstadoProyectoIdioma(@RequestBody AddEstadoProyectoIdiomaDTO addEstadoProyectoIdiomaDTO) {
        addEstadoProyectoIdiomaInterface.add(addEstadoProyectoIdiomaDTO);
        return new ResponseEntity<>("Inserted in database correctly", HttpStatus.CREATED);
    }
}
