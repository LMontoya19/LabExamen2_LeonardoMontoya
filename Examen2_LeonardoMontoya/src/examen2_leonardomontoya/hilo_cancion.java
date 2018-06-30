/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_leonardomontoya;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Inspiron
 */
public class hilo_cancion extends Thread {

    reproducir r = new reproducir();
    int tiempo;
    boolean vive = true;

    public hilo_cancion(int tiempo) {
        this.tiempo = tiempo;
        vive = true;
    }

    @Override
    public void run() {
 
                r.setAlwaysOnTop(vive);
                r.setVisible(true);
        while (vive) {
           
            try {
              r.jProgressBar1.setMaximum(tiempo);
              r.jProgressBar1.setValue(r.jProgressBar1.getValue()+1);
              Thread.sleep(1000);
           
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }

}
