package upf.ac.ma.entity;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity

public class Etudiant implements Serializable {

	   
	@Id
	private Long idEtudiant;
	private static final long serialVersionUID = 1L;

	public Etudiant() {
		super();
	}   
	public Long getIdEtudiant() {
		return this.idEtudiant;
	}

	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
   
}
