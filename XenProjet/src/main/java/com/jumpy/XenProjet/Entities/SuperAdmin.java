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
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
@DiscriminatorValue("Manager")
public class SuperAdmin extends Employe{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String Mdpasse;
	private Agence agence;
	private PointXen pointXen;
	

}
