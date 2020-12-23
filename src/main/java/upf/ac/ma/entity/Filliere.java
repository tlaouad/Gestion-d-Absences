package upf.ac.ma.entity;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Filliere
 *
 */
@Entity

public class Filliere implements Serializable {

	@Id @GeneratedValue
	private Long idFilliere;
	private String nom;
	
	private static final long serialVersionUID = 1L;

	public Filliere() {
		super();
	}
   
}
