package com.AlkemyProject.repository;


import com.AlkemyProject.entity.ContinenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinenteRepository extends JpaRepository<ContinenteEntity, Long> {

}
