package com.oesia.apertura.demo.obra.controller;

import com.oesia.apertura.demo.obra.model.UpdateObraDTO;
import com.oesia.apertura.demo.obra.service.interfaz.UpdateObraInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/obra")
@Api(tags = "Obra")
public class UpdateObra {

    @Autowired
    private UpdateObraInterface updateObraInterface;

    @PutMapping("/updateObra")
    @ApiOperation("UpdateObraController--Update Obra")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "CREATED"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Internal Server Error")})
    public @ResponseBody
    ResponseEntity<String> updateObra (@RequestBody UpdateObraDTO updateObraDTO) {
        updateObraInterface.update(updateObraDTO);
        return new ResponseEntity<>("Updated correctly", HttpStatus.OK);
    }

}
