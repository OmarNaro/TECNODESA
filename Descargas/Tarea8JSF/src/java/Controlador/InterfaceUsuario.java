/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public interface InterfaceUsuario {
   public Usuario buscarUsuario(String login, String password); 
   public ArrayList<Usuario> regresarLista();
}
