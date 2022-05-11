package com.oesia.apertura.demo.alcanceobraidioma.controller;

import com.oesia.apertura.demo.alcanceobraidioma.model.UpdateAlcanceObraIdiomaDTO;
import com.oesia.apertura.demo.alcanceobraidioma.service.interfaz.UpdateAlcanceObraIdiomaInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/alcanceObraIdioma")
@Api(tags = "AlcanceObraIdioma")
public class UpdateAlcanceObraIdioma {

    @Autowired
    private UpdateAlcanceObraIdiomaInterface updateAlcanceObraIdiomaInterface;

    @PutMapping("/updateAlcanceObraIdioma")
    @ApiOperation("UpdateAlcanceObraIdiomaController--Update AlcanceObraIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateAlcanceObraIdioma (@RequestBody UpdateAlcanceObraIdiomaDTO updateAlcanceObraIdiomaDTO) {
        updateAlcanceObraIdiomaInterface.update(updateAlcanceObraIdiomaDTO);
        return new ResponseEntity<>("Updated correctly", HttpStatus.OK);
    }
}
