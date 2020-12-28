package upf.ac.ma.entity;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Date;

=======
import java.lang.Long;
>>>>>>> 7e6614ac54432a8d0ab0d539f878ace1565ed88a
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity
<<<<<<< HEAD
@DiscriminatorValue("Etudiant")
public class Etudiant extends Compte implements Serializable {
=======

public class Etudiant implements Serializable {

	   
	@Id
	private Long idEtudiant;
>>>>>>> 7e6614ac54432a8d0ab0d539f878ace1565ed88a
	private static final long serialVersionUID = 1L;
	@ManyToOne @JoinColumn
	private Promotion promotion;
	@Column(unique = true)
	private String cne;
	public Etudiant() {
		super();
	}   
	public Long getIdEtudiant() {
		return this.idEtudiant;
	}

	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public Etudiant(String nom, String prenom, String email, String motDePasse, Date dateNaissance) {
		super(nom, prenom, email, motDePasse, dateNaissance);
		// TODO Auto-generated constructor stub
	}
	public Promotion getPromotion() {
		return promotion;
	}
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
   
}
