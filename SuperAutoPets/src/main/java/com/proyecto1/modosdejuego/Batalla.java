package com.proyecto1.modosdejuego;

/**
 *
 * @author michael
 */
public class Batalla {

    public void comenzarBatalla() {
        MenuEntreBatalla juego = new MenuEntreBatalla();
        System.out.println("Equipo: ");

        System.out.println("Tienda de animales");
        System.out.println("Seleccione un animal");
        juego.comprarMascotas();
        System.out.println("Comida");
        juego.comprarComida();

    }

    public void iniciarHabilidadesPrimarias() {

    }

    public void golpear() {

    }

    public void indicarPerdedorGanador() {

    }

    public void dinamicaDesbloqueo() {
        Tier desbloquear = new Tier();

        desbloquear.desbloquarTierAnimales();
        desbloquear.desbloquarTierComida();
    }
}
