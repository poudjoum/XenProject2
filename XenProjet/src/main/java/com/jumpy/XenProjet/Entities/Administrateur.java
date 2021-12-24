package com.jumpy.XenProjet.Entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@DiscriminatorValue("Admin")
public class Administrateur extends Employe{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String mdpasse;
	@ManyToOne
	private PointXen pointXen;
	@ManyToOne
	private Agence agence;
	private Date dateCreation;
	private Date HLastConnexion;
	
	

}
