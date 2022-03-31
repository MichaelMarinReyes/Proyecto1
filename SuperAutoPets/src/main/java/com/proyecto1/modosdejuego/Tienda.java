package com.proyecto1.modosdejuego;

import com.proyecto1.alimentos.Comida;
import com.proyecto1.animales.Mascota;

/**
 *
 * @author michael
 */
public class Tienda {

    private Mascota[] animalesTienda;
    private Comida[] comidaTienda;
    private int ronda = 1;
    private String[] tipo = {"Insecto", "Terrestre"};

    Tier mostrarTier = new Tier();

    /**
     * Método que se encarga de mostrar los animales según ronda y tier
     * desbloqueado.
     */
    public void mostrarMascotasAleatorias() {

        if (ronda == 1 && ronda <= 2) {
            for (int i = 0; i < 3; i++) {
                int indice = (int) Math.random() * 8;
                
                mostrarTier.almacenarMascotas();
                
            }
        } else if (ronda == 2 && ronda < 4) {
            //tier2
            for (int i = 0; i < 3; i++) {
                int indice = (int) Math.random() * 16;

            }

        } else if (ronda == 4 && ronda < 6) {
            //tier 3
            for (int i = 0; i < 3; i++) {
                int indice = (int) Math.random() * 27;

            }

        } else if (ronda == 6 && ronda < 8) {
            //tier 4
            for (int i = 0; i < 3; i++) {
                int indice = (int) Math.random() * 35;

            }

        } else if (ronda == 8 && ronda < 10) {
            //tier 5
            for (int i = 0; i < 3; i++) {
                int indice = (int) Math.random() * 43;

            }

        } else if (ronda == 10 && ronda >= 12) {
            for (int i = 0; i < 3; i++) {
                int indice = (int) Math.random() * 52;

            }

        } else if (ronda > 12) {
            for (int i = 0; i < 3; i++) {
                int indice = (int) Math.random() * 54;

            }

        }
    }

    public void mostrarAlimentosRandom() {

        if (ronda == 1 && ronda <= 2) {
            mostrarTier.almacenarTierComida();

        } else if (ronda == 2 && ronda < 4) {

        } else if (ronda == 4 && ronda < 6) {

        } else if (ronda == 6 && ronda < 8) {

        } else if (ronda == 8 && ronda < 10) {

        } else if (ronda == 10 && ronda >= 12) {

        } else if (ronda >= 12) {

        }

    }

    public void mostrarMascotas() {
        for (Mascota mascota : animalesTienda) {
            mascota.toString();
        }
    }

}
