package com.jumpy.XenProjet.Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
@Entity
@Data
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type",length=5)
public abstract class Transaction implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String initiateur;
	private String recepteur;
	private double montant;
	private double frais ;
	private String devise;
	private String ville;
	private Date datetrans;
}
