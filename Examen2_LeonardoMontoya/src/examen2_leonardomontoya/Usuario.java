/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_leonardomontoya;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Inspiron
 */
public class Usuario implements Serializable{
    String nombre;
    String edad;
    String username;
    String password;
    ArrayList<playlist> playlists = new ArrayList();
    ArrayList<Canciones> favoritas = new ArrayList<>();

   private static final long SerialVersionUID=777L;
    public Usuario(String nombre, String edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<playlist> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<Canciones> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(ArrayList<Canciones> favoritas) {
        this.favoritas = favoritas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", username=" + username + ", password=" + password + '}';
    }

 
    
    
    
}
