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
	@ManyToOne(fetch = FetchType.EAGER, 
		       cascade =
	       {
	    		   CascadeType.MERGE,
	               CascadeType.REMOVE
	       }) @JoinColumn
	private Filliere filliere;
	@OneToOne(fetch = FetchType.EAGER, 
		       cascade =
	       {
	    		   CascadeType.MERGE,
	               CascadeType.REMOVE
	       }) @JoinColumn
	private EmploiDuTemps emploiDuTemps;
	private static final long serialVersionUID = 1L;
	
	
	public Promotion(Date dateDebut, Filliere filliere) {
		super();
		this.dateDebut = dateDebut;
		this.filliere = filliere;
		this.emploiDuTemps = emploiDuTemps;
	}


	public Promotion() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Filliere getFilliere() {
		return filliere;
	}


	public void setFilliere(Filliere filliere) {
		this.filliere = filliere;
	}


	public EmploiDuTemps getEmploiDuTemps() {
		return emploiDuTemps;
	}


	public void setEmploiDuTemps(EmploiDuTemps emploiDuTemps) {
		this.emploiDuTemps = emploiDuTemps;
	}
	
	
}
