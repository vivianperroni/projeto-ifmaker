package com.ifms.ifmaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifms.ifmaker.entities.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{

}
