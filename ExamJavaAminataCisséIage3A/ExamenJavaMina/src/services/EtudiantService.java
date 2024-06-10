package ExamenJavaMina.src.services;

import ExamenJavaMina.src.entities.Etudiant;
import ExamenJavaMina.src.repositories.EtudiantRepository;


    public class EtudiantService {
    
    EtudiantRepository etudiantRepository= new EtudiantRepository();

    public void ajouterEtudiant(Etudiant etudiant){
        etudiantRepository.insert(etudiant);
    }

    public Etudiant rechercheEtudiantParMatricule(String matricule){
        return etudiantRepository.selectEtudiantByMatricule(matricule);
    }
   
}


