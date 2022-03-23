package com.proyecto1.animales.tier1;

import com.proyecto1.animales.Animal;

/**
 *
 * @author michael
 */
public class Hormiga extends Animal {

    public Hormiga(int unidadDeDaño, int unidadDeVida, String efecto, String habilidad, int experiencia) {
        super(unidadDeDaño, unidadDeVida, efecto, habilidad, experiencia);
    }

    @Override
    public void setTipo(String[] tipo) {
        tipo = new String[2];
        tipo[0] = tipo;
        tipo[1] = tipo;
        
        
        
    }

    @Override
    public void setEfecto(String efecto) {
        super.setEfecto("Compañerismo");
    }
}
