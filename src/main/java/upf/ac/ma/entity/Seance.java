package upf.ac.ma.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Seance
 *
 */
@Entity

public class Seance implements Serializable {

	@Id
	private Long idSeance;
	private String jour;
	private String heure;
	private static final long serialVersionUID = 1L;

	public Seance() {
		super();
	}

	public Long getIdSeance() {
		return idSeance;
	}

	public void setIdSeance(Long idSeance) {
		this.idSeance = idSeance;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}
   
	
}
