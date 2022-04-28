package com.oesia.apertura.demo.estadoproyecto.controller;

import com.oesia.apertura.demo.estadoproyecto.model.AddEstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.model.EstadoProyectoDTO;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.AddEstadoProyectoInterface;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.UpdateEstadoProyectoInterface;
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
public class UpdateEstadoProyecto {

    @Autowired
    private UpdateEstadoProyectoInterface updateEstadoProyectoInterface;

    @PutMapping("/updateEstadoProyecto")
    @ApiOperation(value = "UpdateEstadoProyectoController--Update EstadoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateEstadoProyecto(@RequestBody EstadoProyectoDTO estadoProyectoDTO) {
        try {
            updateEstadoProyectoInterface.update(estadoProyectoDTO);
            return new ResponseEntity<>("Updated in database correctly", HttpStatus.CREATED);
        }catch (IllegalArgumentException e){
                return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }

}
