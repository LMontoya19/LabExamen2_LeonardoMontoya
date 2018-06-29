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
public class playlist implements Serializable{
    ArrayList<Canciones> playlist = new ArrayList();
    String nombre;
     private static final long SerialVersionUID=777L;
    public playlist(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public ArrayList<Canciones> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Canciones> playlist) {
        this.playlist = playlist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
