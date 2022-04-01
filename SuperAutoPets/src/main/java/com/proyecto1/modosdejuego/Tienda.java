package com.proyecto1.modosdejuego;

import com.proyecto1.alimentos.Comida;
import com.proyecto1.animales.Mascota;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class Tienda {

    private Mascota[] animalesTienda;
    private Comida[] comidaTienda;
    private int ronda = 1;
    private String[] tipo = {"Insecto", "Terrestre"};

    Scanner entrada = new Scanner(System.in);
    Tier mostrarTier = new Tier();

    /**
     * Método que se encarga de mostrar los animales según ronda y tier
     * desbloqueado.
     */
    public void mostrarMascotasAleatorias(int ronda) {
        mostrarTier.desbloquearTierMascota(ronda);
    }

    public void mostrarComidaAleatoria(int ronda){
        mostrarTier.desbloquerTierComida(ronda);
    }
    public void comprarMascotas() {

    }
}
