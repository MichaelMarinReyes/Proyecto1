package com.proyecto1.modosdejuego;

import com.proyecto1.dinamicajuego.MenuEntreBatalla;

/**
 *
 * @author michael
 */
public class Arena {

    private int rondas;

    public void jugar() {
        MenuEntreBatalla juego = new MenuEntreBatalla();
        System.out.println("Equipo: ");
        
        System.out.println("Tienda de animales");
        juego.comprarMascotas();
        System.out.println("Comida");
        juego.comprarComida();
        
        System.out.println("Seleccione un animal");

    }

    public void dinamicaDesbloqueo() {
        Tier desbloquear = new Tier();
        desbloquear.desbloquarTierAnimales();
        desbloquear.desbloquarTierComida();
    }

    public void mostrarMascotasAleatorias() {

    }

    public void restarVida() {

    }

}
