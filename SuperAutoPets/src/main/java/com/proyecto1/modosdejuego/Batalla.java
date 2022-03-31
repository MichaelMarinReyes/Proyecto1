package com.proyecto1.modosdejuego;

import com.proyecto1.animales.Mascota;
import com.proyecto1.jugadores.Computadora;
import com.proyecto1.jugadores.JugadorImportado;
import com.proyecto1.jugadores.Usuario;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class Batalla {

    private int ronda = 1;
    private Computadora boot;

    Scanner entrada = new Scanner(System.in);
    Usuario jugador = new Usuario();
    JugadorImportado jugadorImportado = new JugadorImportado();
    Mascota animal = new Mascota();
    Usuario usuario = new Usuario();
    Tier mostrarTier = new Tier();

    /**
     * Método se encarga de comenzar la batalla, mostrar los animales del
     * usuario y de la IA o jugador importado en caso de modo de juego Arena
     */
    public void jugarArena() {
        //MIENTRAS EL USUARIO O RIVAL TENGA MÁS ANIMALES SE REPITE EL CICLO
        System.out.println("Batalla comenzada\tRonda: " + ronda);
        System.out.println("\nMi equipo");
        //mostrar equipo de usuario
        System.out.println("\nEquipo Rival");
        //mostrar equipo random de la IA

        this.iniciarHabilidadesPrimarias();

        System.out.println("Mascota eliminada");
        //CERRAR CICLO MIENTRAS
        //     System.out.println(this.restarVida());
        System.out.println("Ganador: ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        ronda++;
    }

    public void jugarVersus() {
        jugador.escribirArchivo();
        jugadorImportado.leerArchivo();
        //MIENTRAS EL USUARIO O RIVAL TENGA MÁS ANIMALES SE REPITE EL CICLO
        System.out.println("Batalla comenzada\tRonda: " + ronda);
        System.out.println("\nMi equipo");
        usuario.getEquipo();
        System.out.println("\nEquipo Rival");
        jugadorImportado.getEquipo();
        System.out.println("");

        this.iniciarHabilidadesPrimarias();

        System.out.println("Mascota eliminada");
        //CERRAR CICLO MIENTRAS
        //     System.out.println(this.restarVida());

        ronda++;
    }

    private void iniciarHabilidadesPrimarias() {

    }

    /**
     * Si el usuario se queda sin mascotas para la batalla se le resta vida
     * dependiendo de la ronda en que este.
     */
    private void restarVida() {
        int vidaRestada = 0;
        if (ronda >= 1 && ronda <= 3) {
            vidaRestada = 1;
            usuario.setVida(usuario.getVida() - vidaRestada);
        } else if (ronda >= 4 && ronda <= 6) {
            vidaRestada = 2;
            usuario.setVida(usuario.getVida() - vidaRestada);
        } else {
            vidaRestada = 3;
            usuario.setVida(usuario.getVida() - vidaRestada);
        }

    }
}
