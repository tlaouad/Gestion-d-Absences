package upf.ac.ma.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="Role")
@Table(name = "users")
public abstract class Compte implements Serializable {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@Column(name = "username")
	private String email;
	@Column(name = "password")
	private String motDePasse;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	@Column(name = "enabled")
	private Boolean active=true;
	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}


	private static final long serialVersionUID = 1L;
	public Compte() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public Compte(String nom, String prenom, String email, String motDePasse, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.dateNaissance = dateNaissance;
	}
	
	
}
