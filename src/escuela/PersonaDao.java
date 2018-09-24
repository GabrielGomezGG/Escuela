
package escuela;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonaDao {
    
    
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private String localidad;
    private String lugar_nac;
    private String fecha_nac;
    private String sexo;
    
    //private List<Nota> notas;
    
    public PersonaDao(String nombre, String apellido, int dni, String direccion, String localidad, String lugar_nac, String fecha_nac, String sexo) {
        //this.notas = notas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.localidad = localidad;
        this.lugar_nac = lugar_nac;
        this.fecha_nac = fecha_nac;
        this.sexo = sexo;
        
        //this.notas = new ArrayList();
    }
    
    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getLugar_nac() {
        return lugar_nac;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }
/*
    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void agregarMateria(String materia){
        notas.add( new Nota(materia) );
    }*/
}
