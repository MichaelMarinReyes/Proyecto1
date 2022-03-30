package com.proyecto1.animales.tier3;

import com.proyecto1.animales.Mascota;

/**
 *
 * @author michael
 */
public class Mapache extends Mascota {

    public Mapache(String nombre, int unidadDeDaño, int unidadDeVida, int nivel, String descripicion) {
        super(nombre, unidadDeDaño, unidadDeVida, nivel, descripicion);
    }

    public Mapache(String nombre, int unidadDeDaño, int unidadDeVida, String descripcion) {
        super(nombre, unidadDeDaño, unidadDeVida, descripcion);
    }

    public Mapache() {
    }


    
}
