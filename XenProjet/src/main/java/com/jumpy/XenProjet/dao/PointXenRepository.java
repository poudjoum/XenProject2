package com.jumpy.XenProjet.dao;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jumpy.XenProjet.Entities.PointXen;

import org.springframework.data.jpa.repository.JpaRepository;
@RepositoryRestResource
public interface PointXenRepository extends JpaRepository<PointXen,Long>{
	

}
