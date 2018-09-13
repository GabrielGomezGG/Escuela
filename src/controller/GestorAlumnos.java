
package controller;

import dao.DaoAlumnos;
import ui.Menu;


public class GestorAlumnos {// declaro atri privado
    private DaoAlumnos alumno_dao;
    private Menu v;
    
    public GestorAlumnos (){
        alumno_dao = new DaoAlumnos ();
    }
    
   }
