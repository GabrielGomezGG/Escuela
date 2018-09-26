
package dao;

import escuela.PersonaDao;
import escuela.Profesor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoProfesor implements DaoPersona{ 
   private List<PersonaDao>profes;
   private conexion con;
   //private ResultSet rs;
  
    public DaoProfesor (){
        profes= new ArrayList();
        try{
            con = new conexion();
        }
        catch(Exception e){}
        cargarDatos();
    }
    
    private void cargarDatos()
    {
        String per = "profesor";
        try{
            ResultSet rs= con.consulta(per);
            //con.consulta(per);
            while(rs.next())
            {
                profes.add(new Profesor(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)
                , rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        }catch(Exception e){}
    }
    
    public void guardarDatos (String n, String a, int d, String di, String l, String ln, String fn, String s){// para agregar alumnos
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
    
    public void borrarDatos(int dni, int pos) 
    {
        String per = "profesor";
            profes.remove(pos);
            try{
                con.eliminar(dni, per);
            }catch(Exception e){}
    }

    public List<PersonaDao> getPersona() {
        return profes;
    }
    
    public List<PersonaDao> buscarDatos(String campo, String dato){
        List<PersonaDao> bus = new ArrayList();
        String per = "profesor";
        
        try{
            ResultSet rs= con.busqueda(per, campo, dato);
            while(rs.next())
            {
                bus.add(new Profesor(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)
                , rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        }catch(Exception e){}
        return bus;
    }
}
