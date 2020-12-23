package upf.ac.ma.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Promotion
 *
 */
@Entity

public class Promotion implements Serializable {

	@Id @GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	private Filliere filliere;
	
	private static final long serialVersionUID = 1L;

	public Promotion() {
		super();
	}
   
}
