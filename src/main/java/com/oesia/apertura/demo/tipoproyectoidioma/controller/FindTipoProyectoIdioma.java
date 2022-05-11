package com.oesia.apertura.demo.tipoproyectoidioma.controller;

import com.oesia.apertura.demo.tipoproyectoidioma.model.TipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.FindTipoProyectoIdiomaInterface;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tipoProyectoIdioma")
@Api(tags = "TipoProyectoIdioma")
public class FindTipoProyectoIdioma {

    @Autowired
    private FindTipoProyectoIdiomaInterface findTipoProyectoIdiomaInterface;

    @GetMapping("/listTipoProyectoIdioma/{idTipoProyectoIdioma}")
    @ApiOperation(value = "ListTipoProyectoIdiomaControllerById--List TipoProyectoIdioma by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<TipoProyectoIdiomaDTO> findTipoProyectoIdiomaById (
            @ApiParam(value = "parameterized id", name = "idTipoProyectoIdioma", example = "1", required = true) @PathVariable final long idTipoProyectoIdioma) {
        try {
            TipoProyectoIdiomaDTO tipoProyectoIdiomaDTO = findTipoProyectoIdiomaInterface.findById(idTipoProyectoIdioma);
            return new ResponseEntity<>(tipoProyectoIdiomaDTO, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
