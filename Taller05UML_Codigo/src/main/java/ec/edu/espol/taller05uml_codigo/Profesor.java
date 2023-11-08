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
public class Profesor extends PersonalAcademico{
    private ArrayList<Curso> cursosACargo = new ArrayList();
    
    
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        
    }
    
    public void calificarActividadSumativa(Curso curso,Estudiante estudiante,ActividadSumativa actividadSumativa){
        
    }
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        
    }
    public void crearNuevoForo(Foro foro){
        
    }

    public Profesor() {
    }

    public ArrayList<Curso> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(ArrayList<Curso> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }
    
    
    
    
    
}
