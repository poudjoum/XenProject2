package com.jumpy.XenProjet.Entities;

import java.util.Date;

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
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@DiscriminatorValue("Trans")
public class Transfert extends Transaction{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String codetransfert;
	private String numerodest;
	private String numerorecep;
	private double montant;
	private double SoldeInit;
	private boolean etatTransfert;
	private Date dateTransfert;
	private String codeSecret;
}
