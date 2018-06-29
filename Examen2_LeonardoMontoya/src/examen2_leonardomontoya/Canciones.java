/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_leonardomontoya;

import java.io.Serializable;

/**
 *
 * @author Inspiron
 */
public class Canciones implements Serializable{
    String nombre;
    String artista;
    Album padre;
    int duracion;
    String genero;
     private static final long SerialVersionUID=777L;

    public Canciones(String nombre, String artista, Album padre, int duracion, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.padre = padre;
        this.duracion = duracion;
        this.genero = genero;
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

    public Album getPadre() {
        return padre;
    }

    public void setPadre(Album padre) {
        this.padre = padre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre;
    }
     
     
     
}
