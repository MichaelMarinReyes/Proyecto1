package com.proyecto1.alimentos;

/**
 *
 * @author michael
 */
public class Comida {

    String nombre;
    String tipoComida;
    String descripcion;
    int darVida;
    int darDaño;

    public Comida(String nombre, String descripcion, int darVida, int darDaño) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.darVida = darVida;
        this.darDaño = darDaño;
    }

    public Comida(String nombre, String tipoComida, String descripcion, int darVida, int darDaño) {
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.descripcion = descripcion;
        this.darVida = darVida;
        this.darDaño = darDaño;
    }

    public Comida(String nombre, String tipoComida, String descripion) {
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.descripcion = descripion;
    }

    @Override
    public String toString() {
        return nombre + " " + tipoComida + "\n\tDescripcion: " + descripcion + "\n";
    }

}
