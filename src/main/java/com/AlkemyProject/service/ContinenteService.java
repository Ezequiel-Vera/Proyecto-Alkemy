package com.AlkemyProject.service;

import com.AlkemyProject.dto.ContinenteDTO;
import org.springframework.stereotype.Service;

@Service
public class ContinenteService {

    public ContinenteDTO save(ContinenteDTO dto){
        //TODO: guardar continente
        System.out.println("Guardar Continente");
        return dto;
    }
}
