
package aleatorio;

import java.util.Random;

public class Persona {
    private Random ran = new Random();
    private String nom[];
    private String ape[];
    private int dni;
    private String dire[];
    private String loca[];
    //private String lnac[];
    //private String fnac;
    private String sex[];

    public Persona() {
        nom = new String[]{"Adrian", "Gabriel", "Federico", "Nicolas", "Daniel", "Fernando", "Sabrina", "Diana", "Patty", "Priscila"};
        ape = new String[]{"Lopez", "Gomez","Diaz", "Olmedo", "Larza", "Gonzales", "Perez", "Villarreal", "Condori"};
        dire = new String[]{"Lafe", "Catan", "Morron", "Queso", "Virrey del Pino", "Duende", "Lobos", "San Justo", "Capitan Federal"};
        loca = new String[]{"La Matanza", "Quilmes", "CABA", "Tres de Febrero", "Pizza", "Empanada"};
        sex = new String[]{"M", "F"};
        dni = 0;
    }

    public String getNom() {
        return nom[ran.nextInt(nom.length)];
    }

    public String getApe() {
        return ape[ran.nextInt(ape.length)];
    }

    public int getDni() {
        return dni + ran.nextInt(100000000);
    }

    public String getDire() {
        return dire[ran.nextInt(dire.length)];
    }

    public String getLoca() {
        return loca[ran.nextInt(loca.length)];
    }

    public String getLnac() {
        return dire[ran.nextInt(dire.length)];
    }

    public String getFnac() {
        String s;
        int d = ran.nextInt(32), m = ran.nextInt(13), a = 1970 + ran.nextInt(19);
        s = "" + a + "/" + m + "/" + d;
        return s;
    }

    public String getSex() {
        return sex[ran.nextInt(sex.length)];
    }
    
}
