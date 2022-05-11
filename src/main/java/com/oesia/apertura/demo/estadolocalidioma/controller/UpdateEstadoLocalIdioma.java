package com.oesia.apertura.demo.estadolocalidioma.controller;

import com.oesia.apertura.demo.estadolocalidioma.model.EstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.UpdateEstadoLocalIdiomaInterface;
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
public class UpdateEstadoLocalIdioma {

    @Autowired
    private UpdateEstadoLocalIdiomaInterface updateEstadoLocalIdiomaInterface;

    @PutMapping("/updateEstadoLocalIdioma")
    @ApiOperation(value = "UpdateEstadoLocalIdiomaController--Update EstadoLocalIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateEstadoLocalIdioma(@RequestBody EstadoLocalIdiomaDTO estadoLocalIdiomaDTO) {
        try {
            updateEstadoLocalIdiomaInterface.update(estadoLocalIdiomaDTO);
            return new ResponseEntity<>("Updated in database correctly", HttpStatus.CREATED);
        }catch (IllegalArgumentException e){
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
}
