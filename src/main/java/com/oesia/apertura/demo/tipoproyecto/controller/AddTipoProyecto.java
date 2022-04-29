package com.oesia.apertura.demo.tipoproyecto.controller;

import com.oesia.apertura.demo.tipoproyecto.model.AddTipoProyectoDTO;
import com.oesia.apertura.demo.tipoproyecto.service.interfaz.AddTipoProyectoInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tipoproyecto")
@Api(tags = "TipoProyecto")
public class AddTipoProyecto {

    @Autowired
    private AddTipoProyectoInterface addTipoProyectoInterface;

    @PostMapping("/addTipoProyecto")
    @ApiOperation(value = "addTipoProyectoController--Insert TipoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> addTipoProyecto(@RequestBody AddTipoProyectoDTO addTipoProyectoDTO){
        addTipoProyectoInterface.add(addTipoProyectoDTO);
        return new ResponseEntity<>("Insertado Correctamente", HttpStatus.OK);
    }
}
