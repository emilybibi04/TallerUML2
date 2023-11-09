/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller05uml_codigo;

import java.time.LocalDateTime;

/**
 *
 * @author CltControl
 */
public class Tarea extends ActividadSumativa{
    private LocalDateTime fechadePubliacion;

     public void setFechadePubliacion(LocalDateTime fechadePubliacion) {
        this.fechadePubliacion = fechadePubliacion;
    }
    public Tarea(LocalDateTime fechadePubliacion) {
        this.fechadePubliacion = fechadePubliacion;
    }

    public LocalDateTime getFechadePubliacion() {
        return fechadePubliacion;
    }
   
}
