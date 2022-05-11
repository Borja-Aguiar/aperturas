package com.oesia.apertura.demo.estadolocalidioma.controller;

import com.oesia.apertura.demo.estadolocalidioma.model.EstadoLocalIdiomaDTO;
import com.oesia.apertura.demo.estadolocalidioma.service.interfaz.FindEstadoLocalIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadoLocalIdioma")
@Api(tags = "EstadoLocalIdioma")
public class FindEstadoLocalIdioma {

    @Autowired
    private FindEstadoLocalIdiomaInterface findEstadoLocalIdiomaInterface;

    @GetMapping("/findEstadoLocalIdioma/{idEstadoLocalIdioma}")
    @ApiOperation(value = "ListEstadoLocalIdiomaControllerById--List EstadoLocalIdioma by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<EstadoLocalIdiomaDTO> findEstadoLocalIdiomaById (
            @ApiParam(value = "parameterized id", name = "idEstadoLocalIdioma", example = "1", required = true) @PathVariable final long idEstadoLocalIdioma) {
        try {
            EstadoLocalIdiomaDTO estadoLocalIdiomaDTO = findEstadoLocalIdiomaInterface.findById(idEstadoLocalIdioma);
            return new ResponseEntity<>(estadoLocalIdiomaDTO, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
