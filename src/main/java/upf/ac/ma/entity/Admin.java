package upf.ac.ma.entity;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Date;

=======
import java.lang.Long;
>>>>>>> 7e6614ac54432a8d0ab0d539f878ace1565ed88a
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
<<<<<<< HEAD
@DiscriminatorValue("Admin")
public class Admin extends Compte implements Serializable {
=======

public class Admin implements Serializable {
>>>>>>> 7e6614ac54432a8d0ab0d539f878ace1565ed88a

	   
	@Id
	private Long idAdmin;
	private static final long serialVersionUID = 1L;
	public Admin() {
		super();
	}   
	public Long getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public Admin(String nom, String prenom, String email, String motDePasse, Date dateNaissance) {
		super(nom, prenom, email, motDePasse, dateNaissance);
		// TODO Auto-generated constructor stub
	}
	
}
