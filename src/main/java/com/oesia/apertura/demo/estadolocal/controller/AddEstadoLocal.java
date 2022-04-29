package com.oesia.apertura.demo.estadolocal.controller;

import com.oesia.apertura.demo.estadolocal.model.AddEstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.service.interfaz.AddEstadoLocalInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadolocal")
@Api(tags = "EstadoLocal")
public class AddEstadoLocal {

    @Autowired
    private AddEstadoLocalInterface addEstadoLocalInterface;

    @PostMapping("/add")
    @ApiOperation(value = "AddEstadoLocalController--Insert EstadoLocal")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> addEstadoLocal(@RequestBody AddEstadoLocalDTO addEstadoLocalDTO) {
        addEstadoLocalInterface.add(addEstadoLocalDTO);
        return new ResponseEntity<>("Inserted in database correctly", HttpStatus.CREATED);
    }
}
