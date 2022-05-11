package com.oesia.apertura.demo.obraidioma.controller;

import com.oesia.apertura.demo.obraidioma.model.UpdateObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.service.interfaz.UpdateObraIdiomaInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/obraidioma")
@Api(tags = "ObraIdioma")
public class UpdateObraIdioma {

    @Autowired
    private UpdateObraIdiomaInterface updateObraIdiomaInterface;

    @PutMapping("/updateObraIdioma")
    @ApiOperation(value = "UpdateObraIdiomaController--Update ObraIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateObraIdioma(@RequestBody UpdateObraIdiomaDTO updateObraIdiomaDTO) {
        try {
            updateObraIdiomaInterface.update(updateObraIdiomaDTO);
            return new ResponseEntity<>("Updated in database correctly", HttpStatus.CREATED);
        }catch (IllegalArgumentException e){
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
}
