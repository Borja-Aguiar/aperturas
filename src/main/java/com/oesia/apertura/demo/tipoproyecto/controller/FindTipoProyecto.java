package com.oesia.apertura.demo.tipoproyecto.controller;

import com.oesia.apertura.demo.tipoproyecto.model.TipoProyectoDTO;
import com.oesia.apertura.demo.tipoproyecto.service.interfaz.FindTipoProyectoInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tipoproyecto")
@Api(tags = "TipoProyecto")
public class FindTipoProyecto {

    @Autowired
    private FindTipoProyectoInterface findTipoProyectoInterface;

    @GetMapping("/findByIdTipoProyecto/{idTipoProyecto}")
    @ApiOperation(value = "findByIdTipoProyectoController--Find By IdTipoProyecto")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<TipoProyectoDTO> findTipoProyectoById(
            @ApiParam(value = "parameterized id", name = "idTipoProyecto", example = "1", required = true) @PathVariable final Long idTipoProyecto){
        try{
            TipoProyectoDTO tipoProyectoDTO = findTipoProyectoInterface.findTipoProyectoById(idTipoProyecto);
            return new ResponseEntity<>(tipoProyectoDTO, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
