package com.proyecto1.animales;

/**
 *
 * @author michael
 */
public class Animal {
    private int unidadDeDaño;
    private int unidadDeVida;
    private String efecto;
    private String habilidad;
    private int experiencia;
    private String tipo[] = new String[2];

    public Animal(int unidadDeDaño, int unidadDeVida, String efecto, String habilidad, int experiencia) {
        this.unidadDeDaño = unidadDeDaño;
        this.unidadDeVida = unidadDeVida;
        this.efecto = efecto;
        this.habilidad = habilidad;
        this.experiencia = experiencia;
    }

    public int getUnidadDeDaño() {
        return unidadDeDaño;
    }

    public void setUnidadDeDaño(int unidadDeDaño) {
        this.unidadDeDaño = unidadDeDaño;
    }

    public int getUnidadDeVida() {
        return unidadDeVida;
    }

    public void setUnidadDeVida(int unidadDeVida) {
        this.unidadDeVida = unidadDeVida;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }
    
    public void mostrarFormatoLectura() {
        System.out.println(/*nombre (ataque/vida)*/);
        System.out.println(/*habilidad: descripcion*/);
        System.out.println(/*tipos: 1,2*/);
    }
}
