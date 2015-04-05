/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Usuario;
import Controlador.TablaUsuario;
import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class LoginBean {

    private String user;
    private String password;
    private Usuario user1;
    private TablaUsuario usuarios;
    private ArrayList<Usuario> lista;

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    public String Logear(){
        String pagina;
        user1 = usuarios.buscarUsuario(user, password);
        if (user1 == null) {
            pagina = "intruso";
        } else {
            pagina = "lista";
        }        
        return pagina;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario getUser1() {
        return user1;
    }

    public void setUser1(Usuario user1) {
        this.user1 = user1;
    }

    public TablaUsuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(TablaUsuario usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuario> getLista() {
        lista=usuarios.regresarLista();
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }
    
    
}
