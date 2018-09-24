
package dao;

import java.util.List;

public interface DaoInterface {
    
    public void cargarDatos(String per);
    
    public void guardarDatos(String tipo, String n, String a, int d, String di, String l, String ln, String fn, String s);
    
    public void borrarDatos(String per, int dni, int pos);
    
    public List buscar(String per,String campo, String dato);
}
