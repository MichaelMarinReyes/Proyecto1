package com.proyecto1.jugadores;

import com.proyecto1.animales.Mascota;

/**
 *
 * @author michael
 */
public class Avatar {

    private int vida = 10;
    private int victorias = 0;
    private Mascota[] equipo;

    public Avatar( int vida, int victorias, Mascota[] equipo) {
        this.vida = vida;
        this.victorias = victorias;
        this.equipo = equipo;
    }
    
    public Avatar(){
        
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public Mascota[] getEquipo() {
        for (Mascota mascotas : equipo) {
            System.out.println(mascotas);
        }
        return equipo;
    }

    public void setEquipo(Mascota[] equipo) {
        this.equipo = equipo;
    }

    public boolean indicadorDeVida() {
        return vida > 0;
    }
}