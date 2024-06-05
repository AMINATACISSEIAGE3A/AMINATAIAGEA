import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoursRepository extends Database { 

    private final String SQL_INSERT = "INSERT INTO `cours` ( `id`, `date`, `heureDb`, `heureFin`) VALUES (?,?,?,?);"; 
    private final String SQL_SELECT_BY_ID = "SELECT * FROM `cours` where id like ? "; 
    public void insert(Cours cours) { 
        ouvrirConnexion();
        initPrepareStatement(SQL_INSERT);
        statement.setInt(1, cours.getId()); 
        statement.setDate(2, cours.getDate()); 
        statement.setInt(3, cours.getHeuredb());
        statement.setInt(4, cours.getHeurefin());
        executeUpdate();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    
  
    public Cours selectCoursById(String id) { 
      Cours cours = null;
      try {
        ouvrirConnexion();
        initPrepareStatement(SQL_SELECT_BY_ID);
        statement.setString(1, id);
        ResultSet rs = executeSelect();
        if (rs.next()) {
          cours = new Cours(); 
          cours.setId(rs.getInt("id")); 
          cours.setDate(rs.getDate("date"));
          cours.setHeuredb(rs.getInt("heureDb"));
          cours.setHeurefin(rs.getInt("heureFin"));
        }
        statement.close();
        rs.close();
        conn.close();
      } catch (SQLException e) {
        System.out.println("Erreur de connexion à la BD");
      }
      return cours;
    }

    public List<Cours> selectAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectAll'");
    }
  

  

   
  }
