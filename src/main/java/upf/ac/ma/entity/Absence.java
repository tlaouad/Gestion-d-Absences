package upf.ac.ma.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Absence
 *
 */
@Entity

public class Absence implements Serializable {
	
	@Id @GeneratedValue
	private Long idAbsence;
	private Seance seance;
	private static final long serialVersionUID = 1L;

	public Absence() {
		super();
	}
   
}
