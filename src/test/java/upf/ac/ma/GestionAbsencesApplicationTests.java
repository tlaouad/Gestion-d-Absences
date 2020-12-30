package upf.ac.ma;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import upf.ac.ma.dao.AbsenceRepository;
import upf.ac.ma.dao.AdminRepository;
import upf.ac.ma.dao.EnseignatRepository;
import upf.ac.ma.dao.EtudiantRepository;
import upf.ac.ma.dao.FilliereRepository;
import upf.ac.ma.dao.ModuleRepository;
import upf.ac.ma.dao.SeanceRepository;
import upf.ac.ma.dao.SemestreRepository;
import upf.ac.ma.entity.*;
import upf.ac.ma.entity.Module;

@SpringBootTest
class GestionAbsencesApplicationTests {
	@Autowired
	AbsenceRepository absenceRepository;
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	SeanceRepository seanceRepository;
	@Autowired
	ModuleRepository moduleRepository;
	@Autowired
	EnseignatRepository enseignantRepository;
	@Autowired
	FilliereRepository filliereRepository;
	@Autowired
	SemestreRepository semestreRepository;
	@Autowired
	EtudiantRepository etudiantRepository;
	@Test
	void contextLoads() {
		Enseignant enseignant= enseignantRepository.save(new Enseignant("Itahriouan", "Zakaria", "Itahriouan.Zakaria@gmail.com", "password", new Date()));
		Filliere filliere=filliereRepository.save(new Filliere("GINFO"));
		Semestre semestre=semestreRepository.save(new Semestre("s7"));
		Module module=moduleRepository.save(new Module("Projet tutoré", filliere, enseignant, semestre));
		Seance seance=seanceRepository.save(new Seance("lundi", new Date(), "A17", module, enseignant));
		Etudiant etudiant=etudiantRepository.save(new Etudiant("Sghyar", "yassine", "sghyar.yassine@gmail.com", "password", new Date()));
		absenceRepository.save(new Absence(seance, etudiant));
	}
}
