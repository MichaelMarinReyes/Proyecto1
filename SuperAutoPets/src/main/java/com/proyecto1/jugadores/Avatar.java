package com.proyecto1.jugadores;

/**
 *
 * @author michael
 */
public class Avatar {

    private int vida = 10;
    private int victorias = 0;
    private String[] equipo;

    public Avatar(int vida, int victorias, String[] equipo) {
        this.vida = vida;
        this.victorias = victorias;
        this.equipo = equipo;
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

    public String[] getEquipo() {
        return equipo;
    }

    public void setEquipo(String[] equipo) {
        this.equipo = equipo;
    }

    public boolean indicadorDeVida() {
        return vida > 0;
    }
}