package com.jumpy.XenProjet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.jumpy.XenProjet.Entities.Agence;
@RepositoryRestResource
public interface AgenceRepository extends JpaRepository<Agence,Long>{

}
