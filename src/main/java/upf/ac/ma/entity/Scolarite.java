package upf.ac.ma.entity;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Date;

=======
import java.lang.Long;
>>>>>>> 7e6614ac54432a8d0ab0d539f878ace1565ed88a
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Scolarite
 *
 */
@Entity
<<<<<<< HEAD
@DiscriminatorValue("Scolarite")
public class Scolarite extends Compte implements Serializable {
=======

public class Scolarite implements Serializable {
>>>>>>> 7e6614ac54432a8d0ab0d539f878ace1565ed88a

	   
	@Id
	private Long idScolarite;
	private static final long serialVersionUID = 1L;
	public Scolarite() {
		super();
	}   
	public Long getIdScolarite() {
		return this.idScolarite;
	}

	public void setIdScolarite(Long idScolarite) {
		this.idScolarite = idScolarite;
	}
	public Scolarite(String nom, String prenom, String email, String motDePasse, Date dateNaissance) {
		super(nom, prenom, email, motDePasse, dateNaissance);
		// TODO Auto-generated constructor stub
	}
	
}
