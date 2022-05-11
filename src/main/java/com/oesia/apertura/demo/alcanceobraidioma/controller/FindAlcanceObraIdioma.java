package com.oesia.apertura.demo.alcanceobraidioma.controller;

import com.oesia.apertura.demo.alcanceobraidioma.model.AlcanceObraIdiomaDTO;
import com.oesia.apertura.demo.alcanceobraidioma.service.interfaz.FindAlcanceObraIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/alcanceObraIdioma")
@Api(tags = "AlcanceObraIdioma")
public class FindAlcanceObraIdioma {

    @Autowired
    private FindAlcanceObraIdiomaInterface findAlcanceObraIdiomaInterface;

    @GetMapping("/find/{idAlcanceObraIdioma}")
    @ApiOperation(value = "FindAlcanceObraIdioma--Find AlcanceObraIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<AlcanceObraIdiomaDTO> findAlcanceObraIdiomaById(
            @ApiParam(value = "parameterized id", name = "idAlcanceObraIdioma", example = "1", required = true) @PathVariable final Long idAlcanceObraIdioma) {
        try {
            AlcanceObraIdiomaDTO alcanceObraIdiomaDTO = findAlcanceObraIdiomaInterface.findAlcanceObraById(idAlcanceObraIdioma);
            return new ResponseEntity<>(alcanceObraIdiomaDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
