package ExamenJavaMina.src.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ExamenJavaMina.src.entities.Professeurdeclasse;

public class ProfesseurdeclasseRepository extends Database {
    private final String SQL_SELECT_PROFESSEURDECLASSE = "select * from professeurdeclasse";
    private final String SQL_INSERT_PROFESSEURDECLASSE = "INSERT INTO `professeurdeclasse` ( `id`) VALUES (?);";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM `professeurdeclasse` where id like ? ";

    public List<Professeurdeclasse> selectAll() {
      List<Professeurdeclasse> professeurdeclasseList = new ArrayList<>();
      try {
          ouvrirConnexion();
          initPrepareStatement(SQL_SELECT_PROFESSEURDECLASSE);
          ResultSet rs = executeSelect();
          while (rs.next()) {
              Professeurdeclasse professeurdeclasse = new Professeurdeclasse();
              professeurdeclasse.setId(rs.getInt("id"));
              // Add the newly created object to the list
              professeurdeclasseList.add(professeurdeclasse);
          }
          rs.close();
          closeConnexion();
      } catch (SQLException e) {
          System.out.println("Erreur de connexion à la BD");
      }
      return professeurdeclasseList;
  }

    

    private void closeConnexion() {
    }

    public void insertProfesseurdeclasse(Professeurdeclasse professeurdeclasse) {
        try {
            ouvrirConnexion();
            initPrepareStatement(SQL_INSERT_PROFESSEURDECLASSE);
            statement.setInt(1, professeurdeclasse.getId());
            executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Professeurdeclasse selectProfesseurdeclasseById(int id) {
        Professeurdeclasse professeurdeclasse = null;
        try {
            ouvrirConnexion();
            initPrepareStatement(SQL_SELECT_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = executeSelect();
            if (rs.next()) {
                professeurdeclasse = new Professeurdeclasse();
                professeurdeclasse.setId(rs.getInt("id"));
            }
            statement.close();
            rs.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la BD");
        }
        return professeurdeclasse;
    }





    
    public void insert(Professeurdeclasse pdc) {
       
      throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
}
