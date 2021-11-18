package com.AlkemyProject.service;

import com.AlkemyProject.dto.ContinenteDTO;
import com.AlkemyProject.entity.ContinenteEntity;
import com.AlkemyProject.mapper.ContinenteMapper;
import com.AlkemyProject.repository.ContinenteRepository;
import com.AlkemyProject.service.impl.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteServiceImpl implements ContinenteService {

    @Autowired
    private ContinenteMapper continenteMapper;
    @Autowired
    private ContinenteRepository continenteRepository;


    public ContinenteDTO save(ContinenteDTO dto){
        ContinenteEntity entity=continenteMapper.continenteDTO2Entity(dto);
        //TODO: guardar continente
        ContinenteEntity entitySaved=continenteRepository.save(entity);
        ContinenteDTO result=continenteMapper.continenteEntity2DTO(entitySaved);
        return result;
    }

    public List<ContinenteDTO> getAllContinentes() {
        List<ContinenteEntity> entities=continenteRepository.findAll();
        List<ContinenteDTO> result=continenteMapper.continenteEntityList2DTOList(entities);
        return result;
    }
}
