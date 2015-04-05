/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Omar
 */
public class TablaUsuario implements InterfaceUsuario {

    private Map<String, Usuario> usuarios;
    private ArrayList<Usuario> users;

    public TablaUsuario() {
        users = new ArrayList<>();
        usuarios = new HashMap<>();        
        addUsuario(new Usuario("Lopez Avila", "Juan Antonio", "patito@gmail.com", "123456abc"));
        addUsuario(new Usuario("Ortega Viera", "Alma", "zodiaco@hotmail.com", "123456abc"));
        addUsuario(new Usuario("Casa Jimenez", "Felicia", "limbo@yahoo.com", "123456abc"));
        addUsuario(new Usuario("Lopez Gutierrez", "Francisco", "epcilon@abu.com", "123456abc"));
        addUsuario(new Usuario("Vertti Guzman", "Imelda", "array@msj.com", "123456abc"));
    }

    private void addUsuario(Usuario usuario) {
        usuarios.put(usuario.getCorreEle(), usuario);
        users.add(usuario);
    }

    public Usuario buscarUsuario(String login, String password) {
        Usuario usuario = null;
        if (login != null) {
            usuario = usuarios.get(login);
            if (usuario != null) {
                if (usuario.getPassword().equals(password)) {
                    return usuario;
                } else {
                    return null;
                }
            }
        }
        return null;
        
        
    }

    @Override
    public ArrayList<Usuario> regresarLista() {
        return users;
    }

    public String quitaruser(Usuario user) {
        usuarios.remove(user.getCorreEle());
        users.remove(user);
        return null;
    }
}
