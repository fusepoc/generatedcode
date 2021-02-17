package com.ericsson.ms.module.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ericsson.ms.module.entity.entities.EnvBb;

/**
 * 
 * @author 
 *
 */
@Repository
public interface BuildingBlockRepository extends JpaRepository<EnvBb, String> {

}
