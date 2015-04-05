/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Omar
 */
public class Usuario {
    
    private String apellidos;
    private String nombre;
    private String CorreEle;
    private String password;

    public Usuario(String apellidos, String nombre, String CorreEle, String password) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.CorreEle = CorreEle;
        this.password = password;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreEle() {
        return CorreEle;
    }

    public void setCorreEle(String CorreEle) {
        this.CorreEle = CorreEle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
