package com.oesia.apertura.demo.obraidioma.controller;

import com.oesia.apertura.demo.obraidioma.model.ObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.service.interfaz.FindObraIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/obraidioma")
@Api(tags = "ObraIdioma")
public class FindObraIdioma {

    @Autowired
    private FindObraIdiomaInterface findObraIdiomaInterface;

    @GetMapping("/listObraIdioma/{idObraIdioma}")
    @ApiOperation(value = "ListObraIdiomaControllerById--List ObraIdioma by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<ObraIdiomaDTO> findObraIdiomaById (
            @ApiParam(value = "parameterized id", name = "idObraIdioma", example = "1", required = true) @PathVariable final long idObraIdioma) {
        try {
            ObraIdiomaDTO obraIdiomaDTO = findObraIdiomaInterface.findObraIdiomaById(idObraIdioma);
            return new ResponseEntity<>(obraIdiomaDTO, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
