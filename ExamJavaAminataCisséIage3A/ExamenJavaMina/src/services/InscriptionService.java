package ExamenJavaMina.src.services;

import java.util.List;

import ExamenJavaMina.src.entities.Inscription;
import ExamenJavaMina.src.repositories.InscriptionRepository;

public class InscriptionService {
    InscriptionRepository inscriptionRepository=new InscriptionRepository();

    public void faireInscription(Inscription inscription){
        inscriptionRepository.insert(inscription);
    }
    public List<Inscription>listerInscriptionParAnnee(String anneeScolaire){

        return inscriptionRepository.selectInscriptionByAnnee(anneeScolaire);
    }

    public List<Inscription>listerInscriptionParAnnee(String anneeScolaire, int idClasse){
        return inscriptionRepository.selectInscriptionByAnnee(anneeScolaire, idClasse);
    }
    
    

}
