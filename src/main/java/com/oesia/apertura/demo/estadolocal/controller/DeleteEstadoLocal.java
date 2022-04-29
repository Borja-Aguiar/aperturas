package com.oesia.apertura.demo.estadolocal.controller;

import com.oesia.apertura.demo.estadolocal.service.interfaz.DeleteEstadoLocalInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadolocal")
@Api(tags = "EstadoLocal")
public class DeleteEstadoLocal {

    @Autowired
    private DeleteEstadoLocalInterface deleteEstadoLocalInterface;

    @DeleteMapping("/delete/{idEstadoLocal}")
    @ApiOperation(value = "DeleteEstadoLocalController--Delete EstadoLocal")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> deleteEstadoLocalById(
            @ApiParam(value = "parameterized id", name = "idEstadoLocal", example = "1", required = true) @PathVariable final Long idEstadoLocal) {
        try {
            deleteEstadoLocalInterface.deleteById(idEstadoLocal);
            return new ResponseEntity<>("EstadoLocal removed successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("EstadoLocal removed successfully", HttpStatus.OK);
        }
    }
}
