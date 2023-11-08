/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller05uml_codigo;

/**
 *
 * @author CltControl
 */
public class ActividadSumativa {
    private String titulo;
    private DataTime fechadeEntrega;
    private Float puntajeMaximo;
    private String contenido;
    private Float calificacion;
    private String id;

    public ActividadSumativa(String titulo, DataTime fechadeEntrega, Float puntajeMaximo, String contenido, Float calificacion, String id) {
        this.titulo = titulo;
        this.fechadeEntrega = fechadeEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
        this.calificacion = calificacion;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public DataTime getFechadeEntrega() {
        return fechadeEntrega;
    }

    public void setFechadeEntrega(DataTime fechadeEntrega) {
        this.fechadeEntrega = fechadeEntrega;
    }

    public Float getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(Float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
