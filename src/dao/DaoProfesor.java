
package dao;

import escuela.Profesor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DaoProfesor {// 
   private List<Profesor>profes;
   private conexion con;
  
    public DaoProfesor (){// constru
        profes= new ArrayList();
        try{
            con = new conexion();
        }
        catch(Exception e){}
        cargarA();
    }
    
    private void cargarA()
    {
        try{
            ResultSet rs= con.consulta();
            while(rs.next())
            {
                //alumnos.add(new Alumno(rs.getString(1), rs.getString(2), rs.getInt(3)));
            }
        }catch(Exception e){}
    }
    
    public void guardarA (String n, String a, int d, String di, String l, String ln, String fn, String s){// para agregar alumnos
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
    
    public void borrarA(int dni, int ind) 
    {
            profes.remove(ind);
            try{
                con.eliminar(dni);
            }catch(Exception e){}
    }

    public List<Profesor> getAlumnos() {
        return profes;
    }
}
