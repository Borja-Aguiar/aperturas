package com.oesia.apertura.demo.alcanceobra.controller;

import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.FindAlcanceObraInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/alcanceobra")
@Api(tags = "AlcanceObra")
public class FindAlcanceObra {

    @Autowired
    private FindAlcanceObraInterface findAlcanceObraInterface;

    @GetMapping("/listAlcanceObra/{idAlcanceObra}")
    @ApiOperation(value = "ListEstadoProyectoControllerById--List EstadoProyecto by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<AlcanceObraDTO> findAlcanceObraById (
            @ApiParam(value = "parameterized id", name = "idAlcanceObra", example = "1", required = true) @PathVariable final long idAlcanceObra) {
        try {
            AlcanceObraDTO alcanceObraDTO = findAlcanceObraInterface.findById(idAlcanceObra);
            return new ResponseEntity<>(alcanceObraDTO, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
