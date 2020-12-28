package upf.ac.ma.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import upf.ac.ma.entity.Compte;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
@DiscriminatorValue("Admin")
public class Admin extends Compte implements Serializable {

	
	private static final long serialVersionUID = 1L;
	public Admin() {
		super();
	}
	public Admin(String nom, String prenom, String email, String motDePasse, Date dateNaissance) {
		super(nom, prenom, email, motDePasse, dateNaissance);
		// TODO Auto-generated constructor stub
	}
	
}
