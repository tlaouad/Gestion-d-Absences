package upf.ac.ma.entity;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enseignant
 *
 */
@Entity

public class Enseignant implements Serializable {

	   
	@Id
	private Long idEnseignant;
	private static final long serialVersionUID = 1L;

	public Enseignant() {
		super();
	}   
	public Long getIdEnseignant() {
		return this.idEnseignant;
	}

	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}
   
}
