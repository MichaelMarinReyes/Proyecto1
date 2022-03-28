package com.proyecto1.modosdejuego;

import alimentos.Comida;
import com.proyecto1.animales.Mascota;

/**
 *
 * @author michael
 */
public class Tienda {
    private Mascota[] animalesTienda;
    private Comida[] comidaTienda;
    private int ronda = 0;
    private String[] tipo = {"Insecto","Terrestre"};
    
    Tier animales = new Tier();
    /**
     * Método que se encarga de mostrar los animales según ronda
     * y tier desbloqueado.
     */
    private void mostrarMascotasPorRonda() {
        if (ronda == 1 && ronda <= 2) {
            animalesTienda = new Mascota[3];
            this.mostrarMascotas();
            
            //combinar tier 1
        } else if (ronda == 2 && ronda < 4) {
            //combinar tier 3 con los anteriores
        } else if (ronda == 4 && ronda < 6) {
            // combirat tier 4 con anteriores
        } else if (ronda == 6 && ronda < 8) {
            // combinar tier con los anteriores
        } else if (ronda == 8 && ronda < 10) {
            // combinar tier con anteriores
        } else if (ronda == 10 && ronda >= 12) {
            // combinar todos los tier
        }
    }

    public void mostrarMascotasAleatorias() {
        this.mostrarMascotasPorRonda();
    }

    public void mostrarAlimentosRandom() {

        if (ronda == 1 && ronda <= 2) {
            //combinar tier de comida 1 con 2
        } else if (ronda == 2 && ronda < 4) {
            //combinar tier de comida 3 con los anteriores
        } else if (ronda == 4 && ronda < 6) {
            // combirat tier de comida 4 con anteriores
        } else if (ronda == 6 && ronda < 8) {
            // combinar tier de comida con los anteriores
        } else if (ronda == 8 && ronda < 10) {
            // combinar tier de comida con anteriores
        } else if (ronda == 10 && ronda >= 12) {
            // combinar todos los tier de comida 
        }

    }
    
    public void mostrarMascotas() {
        for (Mascota mascota : animalesTienda) {
            System.out.println(mascota);
        }
    }

}
