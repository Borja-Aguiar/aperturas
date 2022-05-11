package com.oesia.apertura.demo.estadolocalidioma.controller;

import com.oesia.apertura.demo.estadolocalidioma.model.AddEstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.AddEstadoLocalIdiomaInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadoLocalIdioma")
@Api(tags = "EstadoLocalIdioma")
public class AddEstadoLocalIdioma {

    @Autowired
    private AddEstadoLocalIdiomaInterface addEstadoLocalIdiomaInterface;

    @PostMapping("/add")
    @ApiOperation(value = "AddEstadoLocalIdioma--Insert EstadoLocalIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> addEstadoLocalIdioma(@RequestBody AddEstadoLocalIdiomaDTO addEstadoLocalIdiomaDTO) {
        addEstadoLocalIdiomaInterface.add(addEstadoLocalIdiomaDTO);
        return new ResponseEntity<>("Inserted in database correctly", HttpStatus.CREATED);
    }
}
