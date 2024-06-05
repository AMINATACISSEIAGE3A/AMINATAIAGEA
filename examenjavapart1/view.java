import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc = new Scanner(System.in);
        CoursService coursService=new
    CoursService();
        do{
            System.out.println("1-Ajouter une un module");
            System.out.println("2-Lister les module");
            System.out.println("3-Creer les module");
            System.out.println("4-Lister les modules");
            System.out.println("5-quitter");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Entrez le nom du module)");
                String nomModule=sc.nextLine();
                Module mo = new Module();
                mo.setNomModule(nomModule);
                ModuleService.ajouterModule(mo);
                System.out.println("Module ajouté avec succés");


                    break;
                case 2:
                List<module> listermodule= ModuleService.ListerModule();
                for(Module md: listermodule){
                    System.out.println("Id : "+md.getid());
                    System.out.println("Niveau : "+md.getNomModule());
                   
                }

                    break;
                    System.out.println("1-Ajouter une la date du cours");
                    LocalDate date = (LocalDate)sc.nextLine());
                    System.out.println("Entrez le debut du cours");
                    LocalTime date = (LocalTime)parse(sc.nextLine());
                    System.out.println("1-Entrez l'heure de fin du cours");
                    LocalTime date = (LocalTime)parse(sc.nextLine());
                    
                case 3:
 
                    break;
            
                default:
                    break;
            }
        }while(choix!=5);
    }
}