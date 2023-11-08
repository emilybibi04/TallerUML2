/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller05uml_codigo;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Estudiante {
    private ArrayList<Curso> cursosInscritos = new ArrayList();
    private ArrayList<Curso> cursosEnEsperaDeInscripcion = new ArrayList();
    
    public void solicitarInscripcion(Curso curso){
        
    }
    
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        
    }

    public Estudiante() {
    }

    public ArrayList<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public ArrayList<Curso> getCursosEnEsperaDeInscripcion() {
        return cursosEnEsperaDeInscripcion;
    }
    
    
    
}
