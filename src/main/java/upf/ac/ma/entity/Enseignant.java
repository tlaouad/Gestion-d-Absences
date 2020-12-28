package upf.ac.ma.entity;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Date;

=======
import java.lang.Long;
>>>>>>> 7e6614ac54432a8d0ab0d539f878ace1565ed88a
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enseignant
 *
 */
@Entity
<<<<<<< HEAD
@DiscriminatorValue("Enseignant")
public class Enseignant extends Compte implements Serializable {
=======

public class Enseignant implements Serializable {
>>>>>>> 7e6614ac54432a8d0ab0d539f878ace1565ed88a

	   
	@Id
	private Long idEnseignant;
	private static final long serialVersionUID = 1L;
	@OneToOne @JoinColumn
	private EmploiDuTemps emploiDuTemps;
	public Enseignant() {
		super();
	}   
	public Long getIdEnseignant() {
		return this.idEnseignant;
	}

	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}
	public Enseignant(String nom, String prenom, String email, String motDePasse, Date dateNaissance) {
		super(nom, prenom, email, motDePasse, dateNaissance);
		// TODO Auto-generated constructor stub
	}
	public EmploiDuTemps getEmploiDuTemps() {
		return emploiDuTemps;
	}
	public void setEmploiDuTemps(EmploiDuTemps emploiDuTemps) {
		this.emploiDuTemps = emploiDuTemps;
	}
	
}
