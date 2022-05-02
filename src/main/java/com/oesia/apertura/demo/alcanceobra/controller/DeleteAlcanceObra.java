package com.oesia.apertura.demo.alcanceobra.controller;

import com.oesia.apertura.demo.alcanceobra.service.interfaz.DeleteAlcanceObraInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping(path = "/alcanceobra")
@Api(tags = "AlcanceObra")
public class DeleteAlcanceObra {

    @Autowired
    private DeleteAlcanceObraInterface deleteAlcanceObraInterface;

    @DeleteMapping("/delete/{idAlcanceObra}")
    @ApiOperation(value = "DeleteAlcanceObraController--Delete AlcanceObra")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> deleteAlcanceObraById(
            @ApiParam(value = "parameterized id", name = "idAlcanceObra", example = "1", required = true) @PathVariable final long idAlcanceObra) {
        try {
            deleteAlcanceObraInterface.deleteById(idAlcanceObra);

            return new ResponseEntity<>("AlcanceObra removed successfully", HttpStatus.OK);

        }catch (Exception e) {

            return new ResponseEntity<>("idAlcanceObra not found", HttpStatus.NOT_FOUND);

        }
    }
}
