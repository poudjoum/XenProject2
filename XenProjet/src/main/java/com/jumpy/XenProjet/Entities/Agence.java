package com.jumpy.XenProjet.Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Agence implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nomAgence;
	private String niu;//numero d'identifiant unique
	private String telephone;
	private String email;
	private double Solde;
	@OneToMany(mappedBy="agence")
	private Collection<PointXen>pointXen;
	private Administrateur admin;
	private Date dateCreation;
	private Date datemaj;
	
	

}
