package com.oesia.apertura.demo.tipoproyectoidioma.controller;

import com.oesia.apertura.demo.alcanceobra.model.AddAlcanceObraDTO;
import com.oesia.apertura.demo.tipoproyecto.model.AddTipoProyectoDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.model.AddTipoProyectoIdiomaDTO;
import com.oesia.apertura.demo.tipoproyectoidioma.service.interfaz.AddTipoProyectoIdiomaInterface;
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
public class AddTipoProyectoIdioma {
    @Autowired
    private AddTipoProyectoIdiomaInterface addTipoProyectoIdiomaInterface;

    @PostMapping("/add")
    @ApiOperation(value = "AddTipoProyectoIdioma--Insert TipoProyectoIdioma")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> addTipoProyectoIdioma(@RequestBody AddTipoProyectoIdiomaDTO addTipoProyectoIdiomaDTO) {
        addTipoProyectoIdiomaInterface.add(addTipoProyectoIdiomaDTO);
        return new ResponseEntity<>("Inserted in database correctly", HttpStatus.CREATED);
    }
}
