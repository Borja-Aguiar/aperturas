package com.oesia.apertura.demo.estadolocal.controller;

import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.service.interfaz.FindEstadoLocalInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "estadolocal")
@Api(tags = "EstadoLocal")
public class FindEstadoLocal {

    @Autowired
    private FindEstadoLocalInterface findEstadoLocalInterface;

    @GetMapping("/find/{idEstadoLocal}")
    @ApiOperation(value = "FindEstadoLocalController--Find EstadoLocal")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<EstadoLocalDTO> findEstadoLocalById(
        @ApiParam(value = "parameterized id", name = "idEstadoLocal", example = "1", required = true) @PathVariable final Long idEstadoLocal) {
        try {
            EstadoLocalDTO estadoLocalDTO = findEstadoLocalInterface.findEstadoLocalById(idEstadoLocal);
            return new ResponseEntity<>(estadoLocalDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
