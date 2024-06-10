package ExamenJavaMina.src.services;

import java.util.List;

import ExamenJavaMina.src.entities.Professeur;
import ExamenJavaMina.src.entities.Professeurdeclasse;
import ExamenJavaMina.src.repositories.ProfesseurRepository;
import ExamenJavaMina.src.repositories.ProfesseurdeclasseRepository;

public class ProfesseurService {
      ProfesseurRepository professeurRepository=new ProfesseurRepository();
    ProfesseurdeclasseRepository ProfesseurClasseRepository=new ProfesseurdeclasseRepository();

      public void ajouterProfesseur(Professeur professeurs){
         professeurRepository.insert(professeurs);
         List<Professeurdeclasse> professeurdeclasse= professeurs.getProfesseurdeclasses();
         for (Professeurdeclasse pdc:professeurdeclasse) {
            ProfesseurClasseRepository.insert(pdc);
         }

      }
    
    public void insererProfesseur(Professeur professeur) {
        professeurRepository.insert(professeur);
    }

    public List<Professeur>listerProfesseurs(){
      return professeurRepository.selectAll();
  }
}
