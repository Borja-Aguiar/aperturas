package com.oesia.apertura.demo.idioma.controller;

import com.oesia.apertura.demo.idioma.model.IdiomaDTO;
import com.oesia.apertura.demo.idioma.service.interfaz.ListIdiomaInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/idioma")
@Api(tags = "Idioma")
public class ListIdioma {

    @Autowired
    private ListIdiomaInterface listIdiomaInterface;

    @GetMapping("/ListIdioma")
    @ApiOperation(value = "ListIdiomaController--List Idioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<List<IdiomaDTO>> findIdioma() {
        return new ResponseEntity<>(listIdiomaInterface.list(), HttpStatus.OK);
    }
}
