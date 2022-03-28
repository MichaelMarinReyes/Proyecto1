package com.proyecto1.animales;

/**
 *
 * @author michael
 */
public class Mascota {

    private String nombre;
    private int unidadDeDaño;
    private int unidadDeVida;
    private String efecto;
    private String habilidad;
    private int nivel = 1;
    private String[] tipo;
    private String descripicion;

    public Mascota(String nombre, int unidadDeDaño, int unidadDeVida, int nivel, String descripicion) {
        this.nombre = nombre;
        this.unidadDeDaño = unidadDeDaño;
        this.unidadDeVida = unidadDeVida;
        this.nivel = nivel;
        this.descripicion = descripicion;
    }

    public Mascota(String nombre, int unidadDeDaño, int unidadDeVida, String descripcion) {
        this.nombre = nombre;
        this.unidadDeDaño = unidadDeDaño;
        this.unidadDeVida = unidadDeVida;
        this.descripicion = descripcion;
    }

    public Mascota() {
    }

    @Override
    public String toString() {
        return nombre + ": [" + unidadDeDaño + "/" + unidadDeVida + "]\n" + descripicion;
    }

}
