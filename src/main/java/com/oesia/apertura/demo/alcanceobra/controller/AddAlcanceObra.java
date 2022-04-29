package com.oesia.apertura.demo.alcanceobra.controller;

import com.oesia.apertura.demo.alcanceobra.model.AddAlcanceObraDTO;
import com.oesia.apertura.demo.alcanceobra.service.interfaz.AddAlcanceObraInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/alcanceobra")
@Api(tags = "AlcanceObra")
public class AddAlcanceObra {

    @Autowired
    private AddAlcanceObraInterface addAlcanceObraInterface;

    @PostMapping("/add")
    @ApiOperation(value = "AddAlcanceObra--Insert AlcanceObra")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> addAlcanceObra(@RequestBody AddAlcanceObraDTO addAlcanceObraDTO) {
        addAlcanceObraInterface.add(addAlcanceObraDTO);
        return new ResponseEntity<>("Inserted in database correctly", HttpStatus.CREATED);
    }

}
