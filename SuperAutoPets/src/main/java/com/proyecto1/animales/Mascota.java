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
    private int tier;
    private int nivel;
    private String[] tipo;
    private String descripicion;

    public Mascota(String nombre, int nivel, int unidadDeDaño, int unidadDeVida, int tier, String descripicion) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.unidadDeDaño = unidadDeDaño;
        this.unidadDeVida = unidadDeVida;
        this.tier = tier;
        this.descripicion = descripicion;
    }
//
//    public Mascota(String nombre, int tier,  int unidadDeDaño, int unidadDeVida, String descripcion) {
//        this.nombre = nombre;
//        this.tier = tier;
//        this.unidadDeDaño = unidadDeDaño;
//        this.unidadDeVida = unidadDeVida;
//        this.descripicion = descripcion;
//    }

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

    public int getTier() {
        return tier;
    }

    public void setNivel(int nivel) {
        this.tier = nivel;
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
        return nombre + " [" + unidadDeDaño + "/ " + unidadDeVida + "]" + " Nivel: " + nivel + "\n\tTipo:" + tipo + "\n\t" + descripicion + " " + efecto;
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
