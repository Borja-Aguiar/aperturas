package com.oesia.apertura.demo.obraidioma.controller;

import com.oesia.apertura.demo.obraidioma.model.AddObraIdiomaDTO;
import com.oesia.apertura.demo.obraidioma.service.interfaz.AddObraIdiomaInterface;
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
public class AddObraIdioma {
    @Autowired
    private AddObraIdiomaInterface addObraIdiomaInterface;

    @PostMapping("/add")
    @ApiOperation(value = "AddObraIdioma--Insert ObraIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> addObraIdioma(@RequestBody AddObraIdiomaDTO addObraIdiomaDTO) {
        addObraIdiomaInterface.add(addObraIdiomaDTO);
        return new ResponseEntity<>("Inserted in database correctly", HttpStatus.CREATED);
    }
}
