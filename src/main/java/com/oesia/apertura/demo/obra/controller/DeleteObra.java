package com.oesia.apertura.demo.obra.controller;

import com.oesia.apertura.demo.obra.service.interfaz.DeleteObraInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/obra")
@Api(tags = "Obra")
public class DeleteObra {

    @Autowired
    private DeleteObraInterface deleteObraInterface;

    @DeleteMapping("/delete/{idObra}")
    @ApiOperation(value = "DeleteObraController--Delete Obra")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    @ResponseBody
    ResponseEntity<String> deleteAlcanceObraById(
            @ApiParam(value = "parameterized id", name = "idObra", example = "1", required = true) @PathVariable final long idObra) {
                try {
                    deleteObraInterface.deleteById(idObra);
                    return new ResponseEntity<>("Obra removed successfully", HttpStatus.OK);

                }catch (Exception e) {
                    return new ResponseEntity<>("idObra not found", HttpStatus.NOT_FOUND);
                }
            }
    }
