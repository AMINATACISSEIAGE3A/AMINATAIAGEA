import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModuleRepository extends Database { 

    private final String SQL_SELECT_MODULE = "select * from module"; 
    private final String SQL_INSERT_MODULE = "INSERT INTO `module` (`id`, `nomModule`) VALUES (?,?);"; 
    private final String SQL_SELECT_BY_ID = "SELECT * FROM `module` where id like ? ";
  
    public List<Module> selectAll() { 
      List<Module> modules = new ArrayList<>(); 
        ouvrirConnexion();
        initPrepareStatement(SQL_SELECT_MODULE);
        ResultSet rs = executeSelect();
        while (rs.next()) {
          Module module = new Module(); 
          module.setId(rs.getInt("id")); 
          module.setNomModule(rs.getString("nomModule")); 
          modules.add(module); 
        }
        rs.close();
        closeConnexion();
      } catch (SQLException e) {
        System.out.println("Erreur de connexion à la BD");
      }
      return modules; 
    
    private void closeConnexion() {
    }
  
    public void insertModule(Module module) { 
      try {
        ouvrirConnexion();
        initPrepareStatement(SQL_INSERT_MODULE);
        statement.setInt(1, module.getId()); 
        statement.setString(2, module.getNomModule()); 
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  
    public Module selectModuleById(int id) { 
      Module module = null; 
      try {
        ouvrirConnexion();
        initPrepareStatement(SQL_SELECT_BY_ID);
        statement.setInt(1, id);
        ResultSet rs = executeSelect();
        if (rs.next()) {
          module = new Module(); 
          module.setId(rs.getInt("id")); 
          module.setNomModule(rs.getString("nomModule")); 
        }
        statement.close();
        rs.close();
        conn.close();
      } catch (SQLException e) {
        System.out.println("Erreur de connexion à la BD");
      }
      return module; // Renamed "Professeur" to "Module"
    }
  
    public void insert(Module modules) {
      throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
  

  }