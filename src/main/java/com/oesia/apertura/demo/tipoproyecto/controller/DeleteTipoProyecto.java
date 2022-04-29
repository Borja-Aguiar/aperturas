package com.oesia.apertura.demo.tipoproyecto.controller;

import com.oesia.apertura.demo.tipoproyecto.service.interfaz.DeleteTipoProyectoInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tipoproyecto")
@Api(tags = "TipoProyecto")
public class DeleteTipoProyecto {

    @Autowired
    private DeleteTipoProyectoInterface deleteTipoProyectoInterface;

    @DeleteMapping("/deleteTipoProyecto/{idTipoProyecto}")
    @ApiOperation(value = "deleteTipoProyectoController--Delete TipoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> deleteTipoProyecto(
            @ApiParam(value = "parameterized id", name = "idTipoProyecto", example = "1", required = true) @PathVariable final Long idTipoProyecto){
        try{
            deleteTipoProyectoInterface.deleteTipoProyecto(idTipoProyecto);
            return new ResponseEntity<>("Eliminado correctamente", HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>("idTipoProyecto no existe", HttpStatus.NOT_FOUND);
        }
    }
}
