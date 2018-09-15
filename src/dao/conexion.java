
package dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
   private Connection con;
   private Statement sta;
   private ResultSet res;

    public conexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuelaBD", "root", "");
        sta = con.createStatement();
    }
    
    public void guardar(String dato) 
    {
        try
        {
            sta.execute(dato);
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        
        
        //sta.execute("INSERT INTO alumnos (nombre, apellido, dni) Values ('"+nom+"', '"+ape+"', "+dn+" )");
    }
   
    public ResultSet consulta(String per) throws SQLException
    {
        return res = sta.executeQuery("SELECT * FROM "+per);
    }
    
    
    public void eliminar(int dni, String per) throws SQLException
    {
        sta.execute("DELETE FROM "+per+" WHERE dni="+dni+"");
    }
   
}
