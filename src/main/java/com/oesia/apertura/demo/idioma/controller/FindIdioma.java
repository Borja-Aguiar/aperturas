package com.oesia.apertura.demo.idioma.controller;

import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.FindAlcanceObraInterface;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import com.oesia.apertura.demo.idioma.service.interfaz.FindIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/idioma")
@Api(tags = "Idioma")
public class FindIdioma {
    @Autowired
    private FindIdiomaInterface findIdiomaInterface;

    @GetMapping("/listIdioma/{idIdioma}")
    @ApiOperation(value = "ListIdiomaControllerById--List Idioma by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<IdiomaDTO> findIdiomaById (
            @ApiParam(value = "parameterized id", name = "idIdioma", example = "1", required = true) @PathVariable final long idIdioma) {
        try {
            IdiomaDTO idiomaDTO = findIdiomaInterface.findById(idIdioma);
            return new ResponseEntity<>(idiomaDTO, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
