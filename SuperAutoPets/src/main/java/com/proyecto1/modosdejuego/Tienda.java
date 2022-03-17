package com.proyecto1.modosdejuego;

/**
 *
 * @author michael
 */
public class Tienda {

    private int ronda = 0;

    private void mostrarMascotasPorRonda() {
        if (ronda == 1 && ronda <= 2) {
            //combinar tier 1 con 2
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

}
