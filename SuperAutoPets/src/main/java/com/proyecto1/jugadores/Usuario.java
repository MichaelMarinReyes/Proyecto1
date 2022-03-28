package com.proyecto1.jugadores;

import com.proyecto1.animales.Mascota;

/**
 *
 * @author michael
 */
public class Usuario extends Avatar {

    private String nombre;
    private int oro = 10;

    public Usuario(int vida, int victorias, Mascota[] equipo,String nombre) {
        super(vida, victorias, equipo);
        this.nombre = nombre;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }
}
