package com.oesia.apertura.demo.tipoproyectoidioma.controller;

import com.oesia.apertura.demo.estadolocal.model.EstadoLocalDTO;
import com.oesia.apertura.demo.estadolocal.service.interfaz.UpdateEstadoLocalInterface;
import com.oesia.apertura.demo.tipoproyectoidioma.model.TipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.model.UpdateTipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.UpdateTipoProyectoIdiomaInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tipoProyectoIdioma")
@Api(tags = "TipoProyectoIdioma")
public class UpdateTipoProyectoIdioma {

    @Autowired
    private UpdateTipoProyectoIdiomaInterface updateTipoProyectoIdiomaInterface;

    @PutMapping("/updateTipoProyectoIdioma")
    @ApiOperation(value = "UpdateTipoProyectoIdiomaController--Update TipoProyectoIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateTipoProyectoIdioma(@RequestBody UpdateTipoProyectoIdiomaDTO updateTipoProyectoIdiomaDTO) {
        try {
            updateTipoProyectoIdiomaInterface.update(updateTipoProyectoIdiomaDTO);
            return new ResponseEntity<>("Updated in database correctly", HttpStatus.CREATED);
        }catch (IllegalArgumentException e){
            return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
        }
    }
}
