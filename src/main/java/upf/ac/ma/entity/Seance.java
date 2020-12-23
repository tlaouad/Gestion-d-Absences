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
   
}
