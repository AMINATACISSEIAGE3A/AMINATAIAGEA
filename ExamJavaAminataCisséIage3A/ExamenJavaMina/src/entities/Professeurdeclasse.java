package ExamenJavaMina.src.entities;

public class Professeurdeclasse {
    private int id;
    Professeur professeur;
    Classe Classe;
    public Professeurdeclasse() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    public Classe getClasse() {
        return Classe;
    }
    public void setClasse(Classe classe) {
        Classe = classe;
    }



    

    public void add(Professeurdeclasse professeurdeclasse) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
