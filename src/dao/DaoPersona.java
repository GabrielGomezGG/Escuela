
package dao;

import java.sql.ResultSet;

public abstract class DaoPersona implements DaoInterface{
    
    private DaoInterface inter;
    
    public DaoPersona(DaoInterface dao){
        
        inter = dao;
    }

    
    public DaoInterface getDao(){
        return inter;
    }
}
