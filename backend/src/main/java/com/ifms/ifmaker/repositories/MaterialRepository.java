package com.ifms.ifmaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifms.ifmaker.entities.Material;

public interface MaterialRepository extends JpaRepository<Material, Long>{

}
