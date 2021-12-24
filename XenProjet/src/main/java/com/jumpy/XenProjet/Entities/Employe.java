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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor 
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role",length=7)
public abstract class Employe implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String numCni;
	private Date dateNaiss;
	private String numTel;
	private String pays;
	private String ville;
	private String email;
	private Date dateEmbauche;
	private Date heureConnexion;
	

}
