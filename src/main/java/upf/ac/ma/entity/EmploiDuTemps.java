package upf.ac.ma.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmploiDuTemps
 *
 */
@Entity

public class EmploiDuTemps implements Serializable {

	@Id @GeneratedValue
	private Long idEmploi;
	
	private static final long serialVersionUID = 1L;

	public EmploiDuTemps() {
		super();
	}
   
}
