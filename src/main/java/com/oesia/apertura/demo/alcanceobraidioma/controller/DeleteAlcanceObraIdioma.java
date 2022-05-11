package com.oesia.apertura.demo.alcanceobraidioma.controller;

import com.oesia.apertura.demo.alcanceobraidioma.service.interfaz.DeleteAlcanceObraIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/alcanceObraIdioma")
@Api(tags = "AlcanceObraIdioma")
public class DeleteAlcanceObraIdioma {

    @Autowired
    private DeleteAlcanceObraIdiomaInterface deleteAlcanceObraIdiomaInterface;

    @DeleteMapping("/delete/{idAlcanceObraIdioma}")
    @ApiOperation(value = "DeleteAlcanceObraIdiomaController--Delete AlcanceObraIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    @ResponseBody
    ResponseEntity<String> deleteAlcanceObraIdiomaById(
            @ApiParam(value = "parameterized id", name = "idAlcanceObraIdioma", example = "1", required = true) @PathVariable final long idAlcanceObraIdioma) {
        try {
            deleteAlcanceObraIdiomaInterface.deleteById(idAlcanceObraIdioma);
            return new ResponseEntity<>("AlcanceObraIdioma removed successfully", HttpStatus.OK);

        }catch (Exception e) {
            return new ResponseEntity<>("idAlcanceObraIdioma not found", HttpStatus.NOT_FOUND);
        }
    }
}
