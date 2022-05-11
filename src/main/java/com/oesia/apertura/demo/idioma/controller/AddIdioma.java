package com.oesia.apertura.demo.idioma.controller;

import com.oesia.apertura.demo.estadoproyecto.model.AddEstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.AddEstadoProyectoInterface;
import com.oesia.apertura.demo.idioma.model.AddIdiomaDTO;
import com.oesia.apertura.demo.idioma.service.interfaz.AddIdiomaInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/idioma")
@Api(tags = "Idioma")
public class AddIdioma {

    @Autowired
    private AddIdiomaInterface addIdiomaInterface;

    @PostMapping("/add")
    @ApiOperation(value = "AddIdiomaController--Insert Idioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> addIdioma(@RequestBody AddIdiomaDTO addIdiomaDTO) {
        addIdiomaInterface.add(addIdiomaDTO);
        return new ResponseEntity<>("Inserted in database correctly", HttpStatus.CREATED);
    }
}
