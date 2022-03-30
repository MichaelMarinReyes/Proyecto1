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

    Tier animales = new Tier();

    /**
     * Método que se encarga de mostrar los animales según ronda y tier
     * desbloqueado.
     */
    public void elegirAnimalesAMostrar() {
        if (ronda == 1 && ronda <= 2) {
            animales.copiarTierMascotas(8);
            this.mostrarMascotas();
        } else if (ronda == 2 && ronda < 4) {
            //tier2
            animales.copiarTierMascotas(16);
        } else if (ronda == 4 && ronda < 6) {
            //tier 3
            animales.copiarTierMascotas(27);
        } else if (ronda == 6 && ronda < 8) {
            //tier 4
            animales.copiarTierMascotas(35);
        } else if (ronda == 8 && ronda < 10) {
            //tier 5
            animales.copiarTierMascotas(43);
        } else if (ronda == 10 && ronda >= 12) {
            animales.copiarTierMascotas(52);
        } else if (ronda > 12) {
            animales.copiarTierMascotas(54);
        }
    }

    public void mostrarMascotasAleatorias() {

    }

    public void mostrarAlimentosRandom() {

        if (ronda == 1 && ronda <= 2) {
            animales.copiarTierComida(3);
        } else if (ronda == 2 && ronda < 4) {
            animales.copiarTierComida(6);
        } else if (ronda == 4 && ronda < 6) {
            animales.copiarTierComida(10);
        } else if (ronda == 6 && ronda < 8) {
            animales.copiarTierComida(13);
        } else if (ronda == 8 && ronda < 10) {
            animales.copiarTierComida(15);
        } else if (ronda == 10 && ronda >= 12) {
            animales.copiarTierComida(17);
        } else if (ronda >= 12) {
            animales.copiarTierComida(18);
        }

    }

    public void mostrarMascotas() {
        for (Mascota mascota : animalesTienda) {
            mascota.toString();
        }
    }

}
