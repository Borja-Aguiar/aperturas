package com.oesia.apertura.demo.estadolocalidioma.controller;

import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.DeleteEstadoLocalIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadoLocalIdioma")
@Api(tags = "EstadoLocalIdioma")
public class DeleteEstadoLocalIdioma {

    @Autowired
    private DeleteEstadoLocalIdiomaInterface deleteEstadoLocalIdiomaInterface;

    @DeleteMapping("/delete/{idEstadoLocalIdioma}")
    @ApiOperation(value = "DeleteEstadoLocalIdiomaController--Delete EstadoLocalIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> deleteEstadoLocalIdiomaById(
            @ApiParam(value = "parameterized id", name = "idEstadoLocalIdioma", example = "1", required = true) @PathVariable final long idEstadoLocalIdioma) {
        try {
            deleteEstadoLocalIdiomaInterface.deleteById(idEstadoLocalIdioma);

            return new ResponseEntity<>("EstadoLocalIdioma removed successfully", HttpStatus.OK);

        }catch (Exception e) {

            return new ResponseEntity<>("idEstadoLocalIdioma not found", HttpStatus.NOT_FOUND);

        }
    }
}
