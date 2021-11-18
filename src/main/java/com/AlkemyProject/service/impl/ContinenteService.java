package com.AlkemyProject.service.impl;

import com.AlkemyProject.dto.ContinenteDTO;

import java.util.List;

public interface ContinenteService {

    ContinenteDTO save(ContinenteDTO dto);

    List<ContinenteDTO> getAllContinentes();


}

