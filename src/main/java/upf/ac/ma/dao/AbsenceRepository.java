package upf.ac.ma.dao;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import upf.ac.ma.entity.Absence;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {
	@Query("select a from Absence a inner join a.etudiant e where e.id =:x")
	public ArrayList<Absence> findByEtudiant(@Param("x")Long id);
	/*
	 * @Query("select a from Absence a where a.seance s= and s.module m " +
	 * "and m.semestre se where se.idSemestre =:x") public ArrayList<Absence>
	 * findBySemestre(@Param("x")Long id);
	 */
	
}
