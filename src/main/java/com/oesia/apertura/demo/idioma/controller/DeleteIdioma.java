package com.oesia.apertura.demo.idioma.controller;

import com.oesia.apertura.demo.alcanceobra.service.interfaz.DeleteAlcanceObraInterface;
import com.oesia.apertura.demo.idioma.service.interfaz.DeleteIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/idioma")
@Api(tags = "Idioma")
public class DeleteIdioma {
    @Autowired
    private DeleteIdiomaInterface deleteIdiomaInterface;

    @DeleteMapping("/delete/{idIdioma}")
    @ApiOperation(value = "DeleteIdiomaController--Delete Idioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> deleteIdiomaById(
            @ApiParam(value = "parameterized id", name = "idIdioma", example = "1", required = true) @PathVariable final long idIdioma) {
        try {
            deleteIdiomaInterface.deleteById(idIdioma);

            return new ResponseEntity<>("Idioma removed successfully", HttpStatus.OK);

        }catch (Exception e) {

            return new ResponseEntity<>("idIdioma not found", HttpStatus.NOT_FOUND);

        }
    }
}