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
public abstract class Utilisateur implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private String nom;
private String prenom;
private String numCni;
private String Pseudo;
private String motdepasse;
private String pays;
private String ville;
private Date dateNaissance;
private String email;
@OneToMany(mappedBy="utilisateur")
private Collection<Compte>compte;

}
