/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller05uml_codigo;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class Inicidente {
    private int id;
    private DateTime fecha_reportado;
    private String estado;
    private String titulo;
    private String descripcion;
    private List log_actualizaciones;
    private DateTime fecha_cerrada;
    private String tipo;

    public Inicidente(int id, DateTime fecha_reportado, String estado, String titulo, String descripcion, List log_actualizaciones, DateTime fecha_cerrada, String tipo) {
        this.id = id;
        this.fecha_reportado = fecha_reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrada = fecha_cerrada;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateTime getFecha_reportado() {
        return fecha_reportado;
    }

    public void setFecha_reportado(DateTime fecha_reportado) {
        this.fecha_reportado = fecha_reportado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List getLog_actualizaciones() {
        return log_actualizaciones;
    }

    public void setLog_actualizaciones(List log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }

    public DateTime getFecha_cerrada() {
        return fecha_cerrada;
    }

    public void setFecha_cerrada(DateTime fecha_cerrada) {
        this.fecha_cerrada = fecha_cerrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
