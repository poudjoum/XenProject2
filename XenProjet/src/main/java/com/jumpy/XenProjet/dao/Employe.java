package com.jumpy.XenProjet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Employe extends JpaRepository<Employe,Long>{

}
