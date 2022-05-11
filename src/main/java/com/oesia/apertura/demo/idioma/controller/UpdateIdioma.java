package com.oesia.apertura.demo.idioma.controller;

import com.oesia.apertura.demo.alcanceobra.model.AlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.UpdateAlcanceObraInterface;
import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import com.oesia.apertura.demo.idioma.service.interfaz.UpdateIdiomaInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/idioma")
@Api(tags = "Idioma")
public class UpdateIdioma {
    @Autowired
    private UpdateIdiomaInterface updateIdiomaInterface;

    @PutMapping("/updateIdioma")
    @ApiOperation("UpdateIdiomaController--Update Idioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateIdioma (@RequestBody IdiomaDTO idiomaDTO) {
        updateIdiomaInterface.update(idiomaDTO);
        return new ResponseEntity<>("Updated correctly", HttpStatus.OK);
    }

}
