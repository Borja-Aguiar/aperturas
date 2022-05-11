package com.oesia.apertura.demo.estadoproyectoidioma.controller;

import com.oesia.apertura.demo.estadoproyectoidioma.model.EstadoProyectoIdiomaDTO;
import com.oesia.apertura.demo.estadoproyectoidioma.service.interfaz.UpdateEstadoProyectoIdiomaInterface;
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
public class UpdateEstadoProyectoIdioma {

    @Autowired
    private UpdateEstadoProyectoIdiomaInterface updateEstadoProyectoIdiomaInterface;

    @PutMapping("/updateEstadoProyectoIdioma")
    @ApiOperation(value = "UpdateEstadoProyectoIdiomaController--Update EstadoProyectoIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateEstadoProyectoIdioma(@RequestBody EstadoProyectoIdiomaDTO estadoProyectoIdiomaDTO) {
        try {
            updateEstadoProyectoIdiomaInterface.update(estadoProyectoIdiomaDTO);
            return new ResponseEntity<>("Updated in database correctly", HttpStatus.CREATED);
        }catch (IllegalArgumentException e){
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
}
