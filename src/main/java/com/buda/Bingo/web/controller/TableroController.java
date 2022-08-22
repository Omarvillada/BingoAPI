package com.buda.Bingo.web.controller;

import com.buda.Bingo.model.Tablero;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tablero")
public class TableroController {

    @GetMapping("")
    public ResponseEntity<Tablero> getTablero(){
        return new ResponseEntity<>(
            new Tablero(),
                HttpStatus.OK
        );
    }
}
