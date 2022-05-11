package com.oesia.apertura.demo.estadoproyectoidioma.controller;

import com.oesia.apertura.demo.estadoproyectoidioma.model.EstadoProyectoIdiomaDTO;
import com.oesia.apertura.demo.estadoproyectoidioma.service.interfaz.FindEstadoProyectoIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadoProyectoIdioma")
@Api(tags = "EstadoProyectoIdioma")
public class FindEstadoProyectoIdioma {

    @Autowired
    private FindEstadoProyectoIdiomaInterface findEstadoProyectoIdiomaInterface;

    @GetMapping("/listEstadoProyectoIdioma/{idEstadoProyectoIdioma}")
    @ApiOperation(value = "ListEstadoProyectoIdiomaControllerById--List EstadoProyectoIdioma by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<EstadoProyectoIdiomaDTO> findEstadoProyectoIdiomaById (
            @ApiParam(value = "parameterized id", name = "idEstadoProyectoIdioma", example = "1", required = true) @PathVariable final long idEstadoProyectoIdioma) {
        try {
            EstadoProyectoIdiomaDTO estadoProyectoIdiomaDTO = findEstadoProyectoIdiomaInterface.findById(idEstadoProyectoIdioma);
            return new ResponseEntity<>(estadoProyectoIdiomaDTO, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
