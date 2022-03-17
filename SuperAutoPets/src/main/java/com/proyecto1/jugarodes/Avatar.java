package com.proyecto1.jugarodes;

/**
 *
 * @author michael
 */
public class Avatar {
    private String nombre;
    private int vida = 10;
    private int victorias = 0;
    private String[] equipo = new String[5];

    public Avatar(String nombre, int vida, int victorias, String[] equipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.victorias = vida;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    
    
    public void perderVida() {
        
    }
    
    public void ganarTrofeo() {
        
    }
}
