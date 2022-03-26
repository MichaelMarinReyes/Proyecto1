package com.proyecto1.animales.tier1;

import com.proyecto1.animales.Mascota;

/**
 *
 * @author michael
 */
public class Hormiga extends Mascota {

    public Hormiga(String nombre, int unidadDeDaño, int unidadDeVida, int experiencia, String[] tipo, String descripicion) {
        super(nombre, unidadDeDaño, unidadDeVida, experiencia, tipo, descripicion);
    }

    public Hormiga(String nombre, int unidadDeDaño, int unidadDeVida, String descripcion, String[] tipo) {
        super(nombre, unidadDeDaño, unidadDeVida, descripcion, tipo);
    }

    public Hormiga() {
    }


    
}