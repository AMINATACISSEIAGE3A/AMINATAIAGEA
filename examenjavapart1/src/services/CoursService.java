import java.util.List;

public class CoursService {

    CoursRepository coursRepository = new CoursRepository(); 

    public void ajouterCours(Cours cours) {
        coursRepository.insert(cours); 
    }

    public List<Cours> listerCours() { 
        return coursRepository.selectAll(); 
    }

   
}
