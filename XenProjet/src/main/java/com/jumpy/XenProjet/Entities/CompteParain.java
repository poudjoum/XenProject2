package com.jumpy.XenProjet.Entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

@DiscriminatorValue("ComptePere")
public class CompteParain extends Compte{
	private double bonus;

}
