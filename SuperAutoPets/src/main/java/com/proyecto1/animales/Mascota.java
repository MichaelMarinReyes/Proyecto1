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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public String getDescripicion() {
        return descripicion;
    }

    public void setDescripicion(String descripicion) {
        this.descripicion = descripicion;
    }
    
    

    @Override
    public String toString() {
        return nombre + ": [" + unidadDeDaño + "/" + unidadDeVida + "]\n" + descripicion;
    }

    public boolean verificarNombre(String nombreSeleccionado) {
        return nombre.equals(nombreSeleccionado);
    }

    public boolean verificarUnidadDeDaño(int dañoABuscar) {
        return unidadDeDaño == dañoABuscar;
    }

    public boolean verificarUnidadDeVida(int vidaABuscar) {
        return unidadDeVida == vidaABuscar;
    }
}
