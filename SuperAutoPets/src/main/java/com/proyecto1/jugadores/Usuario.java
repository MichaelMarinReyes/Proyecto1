package com.proyecto1.jugadores;

/**
 *
 * @author michael
 */
public class Usuario extends Avatar {

    private String nombre;
    private int oro = 10;

    
    public Usuario () {
        
    }

    public Usuario(int vida, int victorias, String[] equipo, String nombre, int oro) {
        super(vida, victorias, equipo);
        this.nombre = nombre;
        this.oro = oro;
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
