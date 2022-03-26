package com.proyecto1.animales;

/**
 *
 * @author michael
 */
public class Mascota {

    private String nombre;
    private int unidadDeDaño;
    private int unidadDeVida;
    private String efectoActivo;
    private String habilidad;
    private int experiencia = 1;
    private String[] tipo;
    private String descripicion;

    public Mascota(String nombre, int unidadDeDaño, int unidadDeVida, int experiencia, String[] tipo, String descripicion) {
        this.nombre = nombre;
        this.unidadDeDaño = unidadDeDaño;
        this.unidadDeVida = unidadDeVida;
        this.experiencia = experiencia;
        this.tipo = tipo;
        this.descripicion = descripicion;
    }

    public Mascota(String nombre, int unidadDeDaño, int unidadDeVida, String descripcion, String[] tipo) {
        this.nombre = nombre;
        this.unidadDeDaño = unidadDeDaño;
        this.unidadDeVida = unidadDeVida;
        this.descripicion = descripcion;
        this.tipo = tipo;

    }

    public Mascota() {
    }

    @Override
    public String toString() {
        return nombre + ": [" + unidadDeDaño + "/" + unidadDeVida + "]\n" + habilidad + ": " + experiencia + "\n" + tipo;
    }

}
