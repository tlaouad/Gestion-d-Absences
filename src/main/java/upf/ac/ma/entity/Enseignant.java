package upf.ac.ma.entity;

import java.io.Serializable;
import javax.persistence.*;
import upf.ac.ma.entity.Compte;

/**
 * Entity implementation class for Entity: Enseignant
 *
 */
@Entity

public class Enseignant extends Compte implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Enseignant() {
		super();
	}
   
}
