package com.oesia.apertura.demo.estadoproyecto.controller;

import com.oesia.apertura.demo.estadoproyecto.service.interfaz.AddEstadoProyectoInterface;
import com.oesia.apertura.demo.estadoproyecto.service.interfaz.DeleteEstadoProyectoInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadoproyecto")
@Api(tags = "EstadoProyecto")
public class DeleteEstadoProyecto {

    @Autowired
    private DeleteEstadoProyectoInterface deleteEstadoProyectoInterface;

    @DeleteMapping ("/delete/{idEstadoProyecto}")
    @ApiOperation(value = "DeleteEstadoProyectoController--Delete EstadoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> deleteEstadoProyectoById(
            @ApiParam(value = "parameterized id", name = "idEstadoProyecto", example = "1", required = true) @PathVariable final Long idEstadoProyecto) {
        try {
            deleteEstadoProyectoInterface.deleteById(idEstadoProyecto);
            return new ResponseEntity<>("EstadoProyecto removed successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("idEstadoProyecto not exist", HttpStatus.NOT_FOUND);
        }
    }

}
