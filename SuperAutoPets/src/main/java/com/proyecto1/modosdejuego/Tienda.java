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
    
    Mascota mascota = new Mascota("Hormiga", 2, 1, "Da a un aliado al azar (+2/+1)/(+4/+2)/(+6/+3) al morir", tipo);
    Mascota mascota2 = new Mascota();
    Mascota mascota3 = new Mascota();
    Mascota mascota4 = new Mascota();
    Mascota mascota5 = new Mascota();
    Mascota mascota6 = new Mascota();
    Mascota mascota7 = new Mascota();
    
    private void mostrarMascotasPorRonda() {
        if (ronda == 1 && ronda <= 2) {
            animalesTienda = new Mascota[3];
            this.mostrarMascotas();
            animalesTienda[0] = mascota;
            animalesTienda[1] = mascota2;
            animalesTienda[2] = mascota3;
            animalesTienda[3] = mascota4;
            animalesTienda[4] = mascota5;
            animalesTienda[5] = mascota6;
            animalesTienda[6] = mascota7;
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
    
    public void mostrarMascotas() {
        for (Mascota mascota : animalesTienda) {
            System.out.println(mascota);
        }
    }

}
