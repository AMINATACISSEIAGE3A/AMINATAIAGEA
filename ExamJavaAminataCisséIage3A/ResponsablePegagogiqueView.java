import java.util.List;
import java.util.Scanner;

import ExamenJavaMina.src.entities.Classe;
import ExamenJavaMina.src.entities.Professeur;
import ExamenJavaMina.src.entities.Professeurdeclasse;
import ExamenJavaMina.src.services.ClasseService;



public class ResponsablePegagogiqueView {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc = new Scanner(System.in);
        ClasseService classeService=new
    ClasseService();
        do{
            System.out.println("1-Ajouter une classe");
            System.out.println("2-Lister les classes");
            System.out.println("3-Ajouter des professeurs");
            System.out.println("4-Lister les professeurs");
            System.out.println("5-Filtrer les classes d'un professeur");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Entrez le niveau de la classe(L1, L2, L3)");
                String niveau=sc.nextLine();
                System.out.println("Entrez la filière de la classe");
                String filiere=sc.nextLine();
                Classe cl= new Classe();
                cl.setNiveau(niveau);
                cl.setFiliere(filiere);
                System.out.println("Classe ajoutée avec succés");


                    break;
                case 2:
                List<Classe> listerClasses= classeService.ListerClasse();
                for(Classe c: listerClasses){
                    System.out.println("ID : "+c.getId());
                    System.out.println("Niveau : "+c.getNiveau());
                    System.out.println("Filiere : "+c.getFiliere());
                }

                    break;

                case 3:
Professeur professeur=new Professeur();
                
                  System.out.println("Entrer le nci");
                  professeur.setNci(sc.nextLine());
                  sc.nextLine();
                  System.out.println("Entrer le nom complet");
                  professeur.setNomComplet(sc.nextLine());
                  System.out.println("Entrer le grade");
                  professeur.setGrade(sc.nextLine());

                    listerClasses = classeService.ListerClasse();
                    int response;
                    do {
                        for (Classe c : listerClasses) {
                            System.out.println(c.getNiveau()+"-"+c.getFiliere());
                          }
                         System.out.println("Veuillez le selectionner pour l'ajouter ");
                          int idClasse=sc.nextInt(); 
                          cl= classeService.findClasseById(idClasse);
                          if (cl!=null) {
                            Professeurdeclasse professeurdeclasse=new Professeurdeclasse();
                            professeurdeclasse.setClasse(cl);
                            professeur.getProfesseurdeclasses();
                            
                          }else{
                             System.out.println("Cet Id n'existe pas");
                          } 
                          
                         System.out.println("Voulez continuez 1-Oui 2-Non"); 
                         response=sc.nextInt(); 
                       
                    } while (response==1);

                    if (professeur.getProfesseurdeclasses().size()==0) {
                          
                    }else{
                        
                    }

                    break;
            
                default:
                    break;
            }
        }while(choix!=5);
    }
}