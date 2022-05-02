package com.oesia.apertura.demo.obra.controller;

import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.obra.model.ObraDTO;
import com.oesia.apertura.demo.obra.service.interfaz.ListObraInterface;
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
@RequestMapping(path = "/obra")
@Api(tags = "Obra")
public class ListObra {

    @Autowired
    private ListObraInterface listObraInterface;

    @GetMapping("/list")
    @ApiOperation(value = "ListEstadoLocalController--List EstadoLocal")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<List<ObraDTO>> listObra(){
        return new ResponseEntity<>(listObraInterface.list(), HttpStatus.OK);
    }
}
