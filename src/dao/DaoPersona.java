
package dao;

import escuela.PersonaDao;
import java.util.List;

public interface DaoPersona {
    
    // void cargarDatos();
    
    public void guardarDatos(String n, String a, int d, String di, String l, String ln, String fn, String s);
    
    public void borrarDatos(int dni, int pos);
    
    public List<PersonaDao> getPersona();
    
    public List buscarDatos(String campo, String dato);
}
