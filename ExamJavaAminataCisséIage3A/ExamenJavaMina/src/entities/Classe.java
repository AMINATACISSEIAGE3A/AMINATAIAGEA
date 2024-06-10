package ExamenJavaMina.src.entities;

import java.util.ArrayList;
import java.util.List;

public class Classe {
    private int id;
    private String libelle;
    private String filiere;
    private String niveau;
    

    List<Professeur>  professeurs =new ArrayList<>();
    List<Inscription>  inscriptions;
    List<Professeurdeclasse>  professeurdeclasses;
    
    public void setProfesseurdeclasses(List<Professeurdeclasse> professeurdeclasses) {
        this.professeurdeclasses = professeurdeclasses;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getFiliere() {
        return filiere;
    }
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    public String getNiveau() {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    } 

}