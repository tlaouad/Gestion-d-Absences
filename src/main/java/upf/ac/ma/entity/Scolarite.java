package upf.ac.ma.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import upf.ac.ma.entity.Compte;

/**
 * Entity implementation class for Entity: Scolarite
 *
 */
@Entity
@DiscriminatorValue("Scolarite")
public class Scolarite extends Compte implements Serializable {

	
	private static final long serialVersionUID = 1L;
	public Scolarite() {
		super();
	}
	public Scolarite(String nom, String prenom, String email, String motDePasse, Date dateNaissance) {
		super(nom, prenom, email, motDePasse, dateNaissance);
		// TODO Auto-generated constructor stub
	}
	
}
