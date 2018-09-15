
package dao;

import escuela.Profesor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoProfesor {// 
   private List<Profesor>profes;
   private conexion con;
  
    public DaoProfesor (){// constru
        profes= new ArrayList();
        try{
            con = new conexion();
        }
        catch(Exception e){}
        cargarP();
    }
    
    private void cargarP()
    {
        String per = "profesor";
        try{
            ResultSet rs= con.consulta(per);
            while(rs.next())
            {
                profes.add(new Profesor(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)
                , rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        }catch(Exception e){}
    }
    
    public void guardarP (String n, String a, int d, String di, String l, String ln, String fn, String s){// para agregar alumnos
        profes.add(new Profesor(n, a, d, di, l, ln, fn, s));
        
        String db = "INSERT INTO ";
        String tipo = "profesor";
        db = db + tipo +
                " Values ('" +n+ "','" +a+ "'," +d+ ", '" +di+ "', '" 
                + l + "', '" + ln + "', '" +fn + "', '"+ s +"')";
        
        try{
           con.guardar(db);
        }catch(Exception e){}        
    }
    
    public void borrarP(int dni) 
    {
        String per = "profesor";
            profes.remove(dni);
            try{
                con.eliminar(dni, per);
            }catch(Exception e){}
    }

    public List<Profesor> getProfesor() {
        return profes;
    }
}
