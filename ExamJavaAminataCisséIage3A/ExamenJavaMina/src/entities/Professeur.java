package ExamenJavaMina.src.entities;


import java.util.ArrayList;
import java.util.List;

public class Professeur {
    private String nomComplet;
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String nci;
    private String grade;
    List<Classe> classes;
    public List<Classe> getClasses() {
        return classes;
    }
    public void setClassses(List<Classe> classes) {
        this.classes = classes;
    }
    private List<Professeurdeclasse>  classep =new ArrayList<>();
    public List<Professeurdeclasse> getClassep() {
        return classep;
    }
    public void setClassep(List<Professeurdeclasse> classep) {
        this.classep = classep;
    }
    public Professeur() {
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getNci() {
        return nci;
    }
    public void setNci(String nci) {
        this.nci = nci;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public List<Professeurdeclasse> getProfesseurdeclasses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfesseurdeclasses'");
    }
   
    
    
}