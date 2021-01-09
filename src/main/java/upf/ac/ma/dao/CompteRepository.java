package upf.ac.ma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upf.ac.ma.entity.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {
	@Query("select c from Compte c where c.email=:x")
	public Compte getByUserName(@Param("x")String user);
}
