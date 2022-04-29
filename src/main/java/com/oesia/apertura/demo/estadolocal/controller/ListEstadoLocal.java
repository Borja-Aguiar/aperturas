package com.oesia.apertura.demo.estadolocal.controller;

import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.service.interfaz.ListEstadoLocalInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "estadolocal")
@Api(tags = "EstadoLocal")
public class ListEstadoLocal {

    @Autowired
    private ListEstadoLocalInterface listEstadoLocalInterface;

    @GetMapping("/list")
    @ApiOperation(value = "ListEstadoLocalController--List EstadoLocal")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<List<EstadoLocalDTO>> listEstadoLocal(){
        return new ResponseEntity<>(listEstadoLocalInterface.list(), HttpStatus.OK);
    }


}