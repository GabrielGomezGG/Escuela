
package escuela;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class Alat {
    private String nombre[];
    private String apellido[];
    private int dni;
    private Random ran = new Random();
    public Alat()    
    {
        
        nombre = new String[5];
        apellido = new String[5];
        
        for(int i = 0; i < nombre.length; i++)
            nombre[i] = "Nombre"+i;
        
        for(int i = 0; i < apellido.length; i++)
            apellido[i] = "Apellido"+i;
    }

    public String getNombre() {
        return nombre[ran.nextInt(5)];
    }

    public String getApellido() {
        return apellido[ran.nextInt(5)];
    }

    public int getDni() {
        return 10000000 + ran.nextInt(90000000);
    }

    
    
    
}
