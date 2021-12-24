package com.jumpy.XenProjet.Entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class PointXen implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Agence agence;
	@OneToMany(mappedBy="pointXen")
	private Collection<Administrateur> administrateur;
	@OneToMany(mappedBy="pointXen")
	private Collection<Compte>compte;
	
	
	
	

}
