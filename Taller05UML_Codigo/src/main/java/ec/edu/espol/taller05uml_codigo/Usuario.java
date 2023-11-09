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
public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    public ArrayList<Inicidente> incidentes = new ArrayList();
    protected boolean login(){
        
        return true;
    }
    
    protected boolean logout(){
        return true;
    }

    public Usuario(String usuario, String contraseña, String nombre, String apellido) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Inicidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(ArrayList<Inicidente> incidentes) {
        this.incidentes = incidentes;
    }
    
    
    
    
    
    
}
