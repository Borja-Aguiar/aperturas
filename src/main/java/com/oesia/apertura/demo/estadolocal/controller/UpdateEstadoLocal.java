package com.oesia.apertura.demo.estadolocal.controller;

import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.service.interfaz.UpdateEstadoLocalInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/estadolocal")
@Api(tags = "EstadoLocal")
public class UpdateEstadoLocal {

    @Autowired
    private UpdateEstadoLocalInterface updateEstadoLocalInterface;

    @PutMapping("/updateEstadoLocal")
    @ApiOperation(value = "UpdateEstadoLocalController--Update EstadoLocal")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateEstadoLocal(@RequestBody EstadoLocalDTO estadoLocalDTO) {
        try {
            updateEstadoLocalInterface.update(estadoLocalDTO);
            return new ResponseEntity<>("Updated in database correctly", HttpStatus.CREATED);
        }catch (IllegalArgumentException e){
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }

}
