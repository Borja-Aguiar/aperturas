package com.oesia.apertura.demo.estadoproyectoidioma.controller;

import com.oesia.apertura.demo.estadoproyectoidioma.service.interfaz.DeleteEstadoProyectoIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadoProyectoIdioma")
@Api(tags = "EstadoProyectoIdioma")
public class DeleteEstadoProyectoIdioma {

    @Autowired
    private DeleteEstadoProyectoIdiomaInterface deleteEstadoProyectoIdiomaInterface;

    @DeleteMapping("/delete/{idEstadoProyectoIdioma}")
    @ApiOperation(value = "DeleteEstadoProyectoIdiomaController--Delete EstadoProyectoIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> deleteEstadoProyectoIdiomaById(
            @ApiParam(value = "parameterized id", name = "idEstadoProyectoIdioma", example = "1", required = true) @PathVariable final long idEstadoProyectoIdioma) {
        try {
            deleteEstadoProyectoIdiomaInterface.deleteById(idEstadoProyectoIdioma);

            return new ResponseEntity<>("EstadoProyectoIdioma removed successfully", HttpStatus.OK);

        }catch (Exception e) {

            return new ResponseEntity<>("idEstadoProyectoIdioma not found", HttpStatus.NOT_FOUND);

        }
    }
}
