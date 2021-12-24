package com.jumpy.XenProjet.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeCompte",length=10)
public abstract class Compte implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String numCni;
	private String pays;
	private String ville;
	private Date DateCreation;
	private String devise;
	private double solde;
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToOne
	private PointXen pointXen;
	
	

}
