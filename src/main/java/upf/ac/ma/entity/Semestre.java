package upf.ac.ma.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Semestre
 *
 */
@Entity

public class Semestre implements Serializable {
	
	@Id @GeneratedValue
	private Long idSemeste;
	private String nom;
	private static final long serialVersionUID = 1L;

	public Semestre() {
		super();
	}
   
}
