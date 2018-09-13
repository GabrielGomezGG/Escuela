
package escuela;

public class Profesor {

    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private String localidad;
    private String lugar_nac;
    private String fecha_nac;
    private String sexo;

    public Profesor(String nombre, String apellido, int dni, String direccion, String localidad, String lugar_nac, String fecha_nac, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.localidad = localidad;
        this.lugar_nac = lugar_nac;
        this.fecha_nac = fecha_nac;
        this.sexo = sexo;
    }
    
    
    /*
    public void ponerNota1(List<Alumno> alumnos, String materia){
        System.out.println(materia);
        for(Alumno alumno: alumnos){
            Scanner sc = new Scanner(System.in);
            
            for (Nota nota : alumno.getNotas()){
                if( materia.equals(nota.getNombre_de_materia())){
                   System.out.println("La nota 1 del alumno " + alumno.getApellido() + ", " + alumno.getNombre() + " es:");
                   nota.setNota1( sc.nextInt() );
                   break;
                } 
            }
        }
    }*/

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
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

    public String getSexo() {
        return sexo;
    }
}
