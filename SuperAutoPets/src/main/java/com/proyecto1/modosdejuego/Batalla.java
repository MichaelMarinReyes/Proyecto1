package com.proyecto1.modosdejuego;

import com.proyecto1.animales.Mascota;
import com.proyecto1.jugadores.Computadora;
import com.proyecto1.jugadores.Usuario;

/**
 *
 * @author michael
 */
public class Batalla {
    private int ronda = 1;
    private Usuario usuario;
    private Computadora boot;
    private Mascota[] mascota;

    public void comenzarBatalla() {
        MenuEntreBatalla juego = new MenuEntreBatalla();
        System.out.println("Equipo: ");

        System.out.println("Tienda de animales");
        System.out.println("Seleccione un animal");
        juego.comprarMascotas();
        System.out.println("Comida");
        juego.comprarComida();
        this.dinamicaDesbloqueo(ronda + 1);
    }

    Mascota animal = new Mascota();
    public void jugar() {
        System.out.println("Batalla comenzada");
        
        while (usuario.indicadorDeVida()) {
            System.out.println("Mi equipo");
            //mostrar equipo de usuario
            System.out.println("Equipo Rival");
            //mostrar equipo random de la IA
            
        }
        
        System.out.println("Ya no tienes puntos de vida para seguir luchando");

    }

    private void iniciarHabilidadesPrimarias() {

    }

    public void indicarPerdedorGanador() {

    }

    private void dinamicaDesbloqueo(int ronda) {
        Tier desbloquear = new Tier(ronda);

        desbloquear.desbloquarTierAnimales(ronda);
        desbloquear.desbloquarTierComida(ronda);
    }
}
