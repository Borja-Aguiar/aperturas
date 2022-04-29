package com.oesia.apertura.demo.tipoproyecto.controller;

import com.oesia.apertura.demo.tipoproyecto.model.TipoProyectoDTO;
import com.oesia.apertura.demo.tipoproyecto.service.interfaz.UpdateTipoProyectoInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tipoproyecto")
@Api(tags = "TipoProyecto")
public class UpdateTipoProyecto {

    @Autowired
    private UpdateTipoProyectoInterface updateTipoProyectoInterface;

    @PutMapping("/updateTipoProyecto")
    @ApiOperation(value = "updateTipoProyectoController--Update TipoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateTipoProyecto(@RequestBody TipoProyectoDTO tipoProyectoDTO){
        try {
            updateTipoProyectoInterface.update(tipoProyectoDTO);
            return new ResponseEntity<>("Campo modificado", HttpStatus.OK);
        }catch (IllegalArgumentException e){
            return new ResponseEntity<>("Id no encontrado", HttpStatus.NOT_FOUND);
        }
    }
}
