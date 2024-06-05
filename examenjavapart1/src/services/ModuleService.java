import java.util.List;

public class ModuleService {
    ModuleRepository moduleRepository = new ModuleRepository();
  
    public void ajouterModule(Module module) {
      moduleRepository.insertModule(module); 
    }
  
    public List<Module> listerModules() {
      return moduleRepository.selectAll();
    }
  
    public Module findModuleById(int id) {
      return moduleRepository.selectModuleById(id); 
    }
  }