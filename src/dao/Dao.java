
package dao;

import escuela.PersonaDao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Dao implements DaoInterface{

    private conexion con;
    private ResultSet rs;

    public Dao() {
        try{
           con = new conexion();
        }
        catch(Exception e){}
    }
    
    @Override
    public void cargarDatos(String per) {
                
        try{
            con.consulta(per);
        }catch(Exception e){}
    }

    @Override
    public void guardarDatos(String tipo, String n, String a, int d, String di, String l, String ln, String fn, String s) {
        String db = "INSERT INTO ";
        db = db + tipo +
                " Values ('" +n+ "','" +a+ "'," +d+ ", '" +di+ "', '" 
                + l + "', '" + ln + "', '" +fn + "', '"+ s +"')";
        
        try{
           con.guardar(db);
        }catch(Exception e){}
    }

    @Override
    public void borrarDatos(String per, int dni, int posicion) {
        try{
                con.eliminar(dni, per);
            }catch(Exception e){}
    }

    @Override
    public List<PersonaDao> buscar(String per, String campo, String dato) {
        List<PersonaDao> bus = new ArrayList();
        
        try{
            ResultSet rs= con.busqueda(per, campo, dato);
            while(rs.next())
            {
                bus.add(new PersonaDao(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)
                , rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)) {});
            }
        }catch(Exception e){}
        return bus;
    }
    
}
