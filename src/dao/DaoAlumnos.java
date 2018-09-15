
package dao;

import escuela.Alumno;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoAlumnos {// 
   private List<Alumno>alumnos;
   private conexion con;
  
    public DaoAlumnos (){// constru
        alumnos= new ArrayList();
        try{
            con = new conexion();
        }
        catch(Exception e){}
        cargarA();
    }
    
    private void cargarA()
    {
        String per = "alumno";
        try{
            ResultSet rs= con.consulta(per);
            while(rs.next())
            {
                alumnos.add(new Alumno(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)
                , rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        }catch(Exception e){}
    }
    
    public void guardarA (String n, String a, int d, String di, String l, String ln, String fn, String s){// para agregar alumnos
        alumnos.add(new Alumno(n, a, d, di, l, ln, fn, s));
        
        String db = "INSERT INTO ";
        String tipo = "alumno";
        db = db + tipo +
                " Values ('" +n+ "','" +a+ "'," +d+ ", '" +di+ "', '" 
                + l + "', '" + ln + "', '" +fn + "', '"+ s +"')";
        
        try{
           con.guardar(db);
        }catch(Exception e){}        
    }
    
    public void borrarA(int dni, int posi) 
    {
        String per = "alumno";
            alumnos.remove(posi);
            try{
                con.eliminar(dni, per);
            }catch(Exception e){}
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
