
package dao;

import escuela.Alumno;
import escuela.PersonaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoAlumnos implements DaoPersona{
   private List<PersonaDao>alumnos;
   private conexion con;
  
    public DaoAlumnos (){
        alumnos= new ArrayList();
        try{
            con = new conexion();
        }
        catch(Exception e){}
        cargarDatos();
    }
    
    private void cargarDatos()
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
    
    public void guardarDatos (String n, String a, int d, String di, String l, String ln, String fn, String s){// para agregar alumnos
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
    
    public void borrarDatos(int dni, int pos) 
    {
        String per = "alumno";
            alumnos.remove(pos);
            try{
                con.eliminar(dni, per);
            }catch(Exception e){}
    }

    public List<PersonaDao> getPersona() {
        return alumnos;
    }
    
    public List<PersonaDao> buscarDatos(String campo, String dato){
        List<PersonaDao> bus = new ArrayList();
        String per = "alumno";
        
        try{
            ResultSet rs= con.busqueda(per, campo, dato);
            while(rs.next())
            {
                bus.add(new Alumno(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)
                , rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        }catch(Exception e){}
        return bus;
    }

}
