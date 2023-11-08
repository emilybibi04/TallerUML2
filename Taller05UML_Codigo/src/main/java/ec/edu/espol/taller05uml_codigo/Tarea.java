/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller05uml_codigo;

import java.util.Date;

/**
 *
 * @author CltControl
 */
public class Tarea extends ActividadSumativa{
    private DateTime fechadePubliacion;

     public void setFechadePubliacion(DateTime fechadePubliacion) {
        this.fechadePubliacion = fechadePubliacion;
    }
    public Tarea(DateTime fechadePubliacion) {
        this.fechadePubliacion = fechadePubliacion;
    }

    public Date getFechadePubliacion() {
        return fechadePubliacion;
    }

   
    
}
