package com.oesia.apertura.demo.estadolocalidioma.controller;

import com.oesia.apertura.demo.estadolocalidioma.model.EstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.ListEstadoLocalIdiomaInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/estadoLocalIdioma")
@Api(tags = "EstadoLocalIdioma")
public class ListEstadoLocalIdioma {

    @Autowired
    private ListEstadoLocalIdiomaInterface listEstadoLocalIdiomaInterface;

    @GetMapping("/ListEstadoLocalIdioma")
    @ApiOperation(value = "ListEstadoLocalIdiomaController--List EstadoLocalIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<List<EstadoLocalIdiomaDTO>> findEstadoLocalIdioma() {
        return new ResponseEntity<>(listEstadoLocalIdiomaInterface.list(), HttpStatus.OK);
    }
}
