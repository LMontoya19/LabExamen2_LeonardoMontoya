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
public class Album implements Serializable {
    String nombre;
    String artista;
    ArrayList<Canciones> lista_canciones = new ArrayList();
    
    
     private static final long SerialVersionUID=777L;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Canciones> getLista_canciones() {
        return lista_canciones;
    }

    public void setLista_canciones(ArrayList<Canciones> lista_canciones) {
        this.lista_canciones = lista_canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }

  
     
}
