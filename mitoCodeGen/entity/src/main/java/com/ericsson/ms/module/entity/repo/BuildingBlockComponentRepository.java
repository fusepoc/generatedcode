package com.ericsson.ms.module.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ericsson.ms.module.entity.entities.EnvBbcomp;

/**
 * 
 * @author 
 *
 */
@Repository
public interface BuildingBlockComponentRepository extends JpaRepository<EnvBbcomp, String> {

}
