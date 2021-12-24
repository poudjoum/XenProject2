package com.jumpy.XenProjet.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@DiscriminatorValue("Virem")
public class Virement extends Transaction{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String codeVirement;
	private String email;
	private double soldeInitial;
	private double montant;
	private String emaildep;
	private String emailRecep;

}
