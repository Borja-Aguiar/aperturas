package com.oesia.apertura.demo.tipoproyectoidioma.controller;

import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.DeleteTipoProyectoIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tipoProyectoIdioma")
@Api(tags = "TipoProyectoIdioma")
public class DeleteTipoProyectoIdioma {

    @Autowired
    private DeleteTipoProyectoIdiomaInterface deleteTipoProyectoIdiomaInterface;

    @DeleteMapping("/delete/{idTipoProyectoIdioma}")
    @ApiOperation(value = "DeleteTipoProyectoIdiomaController--Delete TipoProyectoIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> deleteTipoProyectoIdiomaById(
            @ApiParam(value = "parameterized id", name = "idTipoProyectoIdioma", example = "1", required = true) @PathVariable final long idTipoProyectoIdioma) {
        try {
            deleteTipoProyectoIdiomaInterface.deleteById(idTipoProyectoIdioma);

            return new ResponseEntity<>("AlcanceObra removed successfully", HttpStatus.OK);

        }catch (Exception e) {

            return new ResponseEntity<>("idTipoProyectoIdioma not found", HttpStatus.NOT_FOUND);

        }
    }
}
