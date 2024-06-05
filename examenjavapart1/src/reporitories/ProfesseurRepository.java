import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesseurRepository extends Database {

        private final String SQL_SELECT_PROFESSEUR = "select * from professeur";
        private final String SQL_INSERT_PROFESSEUR = "INSERT INTO `professeur` (`id`, `nom`, `prenom`, `tel`) VALUES (?,?,?,?);"; 
        private final String SQL_SELECT_BY_ID = "SELECT * FROM `professeur` where id like ? "; 
    
        public List<Professeur> selectAll() {
            List<Professeur> professeurs = new ArrayList<>();
            try {
                ouvrirConnexion();
                initPrepareStatement(SQL_SELECT_PROFESSEUR);
                ResultSet rs = executeSelect();
                while (rs.next()) {
                    Professeur professeur = new Professeur();
                    professeur.setId(rs.getInt("id"));
                    professeur.setNom(rs.getString("nom")); 
                    professeur.setPrenom(rs.getString("prenom")); 
                    professeur.setTel(rs.getInt("tel")); 
                    professeurs.add(professeur);
                }
                rs.close();
                closeConnexion();
            } catch (SQLException e) {
                System.out.println("Erreur de connexion à la BD");
            }
            return professeurs;
        }
    
        private void closeConnexion() {
        }
    
        public void insertProfesseur(Professeur professeur) {
            try {
                ouvrirConnexion();
                initPrepareStatement(SQL_INSERT_PROFESSEUR);
                statement.setInt(1, professeur.getId());
                statement.setString(2, professeur.getNom());
                statement.setString(3, professeur.getPrenom());
                statement.setInt(4, professeur.getTel());
                executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
        public Professeur selectProfesseurById(int id) {
            Professeur professeur = null;
            try {
                ouvrirConnexion();
                initPrepareStatement(SQL_SELECT_BY_ID);
                statement.setInt(1, id);
                ResultSet rs = executeSelect();
                if (rs.next()) {
                    professeur = new Professeur();
                    professeur.setId(rs.getInt("id"));
                    professeur.setNom(rs.getString("nom"));
                    professeur.setPrenom(rs.getString("prenom"));
                    professeur.setTel(rs.getInt("tel"));
                }
                statement.close();
                rs.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erreur de connexion à la BD");
            }
            return professeur;
        }
    
        public void insert(Professeur professeurs) {
            throw new UnsupportedOperationException("Unimplemented method 'insert'");
        }
    }
