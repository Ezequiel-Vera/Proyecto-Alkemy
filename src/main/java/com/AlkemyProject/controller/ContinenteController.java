package com.AlkemyProject.controller;

import com.AlkemyProject.dto.ContinenteDTO;
import com.AlkemyProject.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("continentes")
public class ContinenteController {

    @Autowired
    private ContinenteService continenteService;
    @PostMapping
    public ResponseEntity<ContinenteDTO> save(@RequestBody ContinenteDTO continente){
        //save continente
        ContinenteDTO continenteGuardado=continenteService.save(continente);
        // 201, continenete guardado
        return ResponseEntity.status(HttpStatus.CREATED).body(continenteGuardado);
    }
}
