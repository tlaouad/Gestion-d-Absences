package upf.ac.ma;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.javafaker.Faker;

import upf.ac.ma.dao.AbsenceRepository;
import upf.ac.ma.dao.AdminRepository;
import upf.ac.ma.dao.EmploiDuTempsRepository;
import upf.ac.ma.dao.EnseignatRepository;
import upf.ac.ma.dao.EtudiantRepository;
import upf.ac.ma.dao.FilliereRepository;
import upf.ac.ma.dao.ModuleRepository;
import upf.ac.ma.dao.PromotionRepository;
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
	@Autowired
	PromotionRepository promotionRepository;
	@Autowired
	EmploiDuTempsRepository emploiDuTempsRepository;
	@Test
	void contextLoads() {
		addValues();
	}
	void addValues()
	{
		Faker faker=new Faker(new Locale("fr"));
		Filliere filliere=filliereRepository.save(new Filliere("Génie informatique"));
		Promotion promotion= promotionRepository.save(new Promotion(faker.date().between(new Date(2017), new Date(2021)),filliere ));
		for (int i=0;i<10;i++)
		{
			Etudiant etudiant=etudiantRepository.save(new Etudiant(faker.name().firstName(), faker.name().lastName(),faker.internet().safeEmailAddress(), faker.internet().password(8, 10, true), faker.date().birthday(),promotion,faker.code().isbn10()));
			Enseignant enseignant=enseignantRepository.save(new Enseignant(faker.name().firstName(), faker.name().lastName(),faker.internet().safeEmailAddress(), faker.internet().password(8, 10, true), faker.date().birthday()));
		}		
	}
}
