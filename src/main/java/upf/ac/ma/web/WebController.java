package upf.ac.ma.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import upf.ac.ma.dao.AbsenceRepository;
import upf.ac.ma.dao.EnseignatRepository;
import upf.ac.ma.dao.EtudiantRepository;
import upf.ac.ma.entity.Enseignant;
import upf.ac.ma.entity.Etudiant;


@Controller
public class WebController{
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EnseignatRepository enseignantRepository;
	@Autowired
	AbsenceRepository absenceReposiroty;
	@RequestMapping(value = "/etudiants")
	   public String etudiant(Model model) {
		List<Etudiant>etudiants=etudiantRepository.findAll();
		model.addAttribute("listetudiants",etudiants);
	      return "etudiants";
	   }
	@RequestMapping(value = "/enseignants")
	   public String enseignant(Model model) {
		List<Enseignant>enseignants=enseignantRepository.findAll();
		model.addAttribute("listenseignants",enseignants);
	      return "enseignants";
	   }
	@RequestMapping(value = "/menu")
		public String menu()
		{
			return "menu";
		}
	@RequestMapping(value="/auth_login")
		public String login() {
		return "auth_login";
	}
	@RequestMapping(value = "/")
	public String home()
	{
		return "redirect:/menu";
	}
}


