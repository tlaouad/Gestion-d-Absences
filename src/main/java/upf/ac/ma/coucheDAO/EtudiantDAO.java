package upf.ac.ma.coucheDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import upf.ac.ma.entity.Compte;

public class EtudiantDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Gestion_d_Absences");
	EntityManager em 		 = emf.createEntityManager();
	
	public EtudiantDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	void changerMotDePasse(int idEtudiant, String NewPass)
	{
		Compte compte = (Compte) em.createQuery("SELECT * FROM compte WHERE id_utilisateur="+idEtudiant).getSingleResult();
		compte.setMotDePasse(NewPass);
		em.getTransaction().begin();
		em.persist(compte);
		em.getTransaction().commit();
	}


}
