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

	public Long getIdModule() {
		return idModule;
	}

	public void setIdModule(Long idModule) {
		this.idModule = idModule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Filliere getFilliere() {
		return filliere;
	}

	public void setFilliere(Filliere filliere) {
		this.filliere = filliere;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	
	
   
}
