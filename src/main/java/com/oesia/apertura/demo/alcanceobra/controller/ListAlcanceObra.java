package com.oesia.apertura.demo.alcanceobra.controller;

import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.ListAlcanceObraInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alcanceobra")
@Api(tags = "AlcanceObra")
public class ListAlcanceObra {

    @Autowired
    private ListAlcanceObraInterface listAlcanceObraInterface;

    @GetMapping("/ListAlcanceObra")
    @ApiOperation(value = "ListEstadoProyectoController--List EstadoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<List<AlcanceObraDTO>> findAlcanceobra() {
        return new ResponseEntity<>(listAlcanceObraInterface.list(), HttpStatus.OK);
    }

}
