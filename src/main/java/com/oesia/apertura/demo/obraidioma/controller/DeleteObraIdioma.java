package com.oesia.apertura.demo.obraidioma.controller;

import com.oesia.apertura.demo.obraidioma.service.interfaz.DeleteObraIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/obraidioma")
@Api(tags = "ObraIdioma")
public class DeleteObraIdioma {

    @Autowired
    private DeleteObraIdiomaInterface deleteObraIdiomaInterface;

    @DeleteMapping("/delete/{idObraIdioma}")
    @ApiOperation(value = "DeleteObraIdiomaController--Delete ObraIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> deleteObraIdiomaById(
            @ApiParam(value = "parameterized id", name = "idObraIdioma", example = "1", required = true) @PathVariable final long idObraIdioma) {
        try {
            deleteObraIdiomaInterface.deleteById(idObraIdioma);

            return new ResponseEntity<>("ObraIdioma removed successfully", HttpStatus.OK);

        }catch (Exception e) {

            return new ResponseEntity<>("idObraIdioma not found", HttpStatus.NOT_FOUND);

        }
    }
}
