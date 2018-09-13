
package escuela;

public class Nota {
    private String nombre_de_materia;
    private int nota1,nota2,nota3;

    public Nota(String nombre_de_materia) {
        this.nombre_de_materia = nombre_de_materia;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }

    public String getNombre_de_materia() {
        return nombre_de_materia;
    }
    
    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    
    public float sacarNotaFinal(){
        float promedio;
        promedio = (nota1 + nota2 + nota3)/3;
        return promedio;
    }
    
}
