package upf.ac.ma.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Module
 *
 */
@Entity

public class Module implements Serializable {

	@Id @GeneratedValue
	private Long idModule;
	private String nom;
	private Filliere filliere;
	private Enseignant enseignant;
	private static final long serialVersionUID = 1L;

	public Module() {
		super();
	}
   
}
