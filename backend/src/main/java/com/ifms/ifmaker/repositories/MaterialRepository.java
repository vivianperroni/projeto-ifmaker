package com.ifms.ifmaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifms.ifmaker.entities.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long>{
	  
}