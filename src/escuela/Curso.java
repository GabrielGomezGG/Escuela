
package escuela;

import java.util.List;

public class Curso {
    private int anio;
    private int division;
    private String modalidad;
    private List<Alumno> alumnos;

    public Curso(int año, int division, List<Alumno> alumnos, String modalidad) {
        this.anio = año;
        this.division = division;
        this.alumnos = alumnos;
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }
    
    public void agregarAlumno(Alumno a){
        this.alumnos.add(a);
    }

    public int getAnio() {
        return anio;
    }

    public int getDivision() {
        return division;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

}
