
package controller;

import dao.DaoAlumnos;


public class GestorAlumnos {// declaro atri privado
    private DaoAlumnos alumno_dao;
    
    public GestorAlumnos (){
        alumno_dao = new DaoAlumnos ();
    }
    
   }
