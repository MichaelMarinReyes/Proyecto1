package com.proyecto1.modosdejuego;

import camposdejuego.CampoDeJuego;
import com.proyecto1.animales.Mascota;
import com.proyecto1.jugadores.Computadora;
import com.proyecto1.jugadores.JugadorImportado;
import com.proyecto1.jugadores.Usuario;
import java.util.InputMismatchException;
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

    public void comenzarBatalla() {
        MenuEntreBatalla juego = new MenuEntreBatalla();
        System.out.println("Equipo: ");
        jugador.getEquipo();

        System.out.println("Seleccione un animal");
        juego.comprarMascotas();
        System.out.println("Comida");
        juego.comprarComida();
        this.dinamicaDesbloqueo(ronda + 1);
    }

    Mascota animal = new Mascota();
    Usuario usuario = new Usuario();
    Tier mostrarTier = new Tier();

    /**
     * Método se encarga de comenzar la batalla, mostrar los animales del
     * usuario y de la IA o jugador importado en caso de modo de juego Arena
     */
    public void jugarArena() {
        this.seleccionarMapa();
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

        ronda++;
        mostrarTier.desbloquarTierAnimales(ronda);
        mostrarTier.desbloquarTierComida(ronda);

    }

    public void jugarVersus() {
        jugador.escribirArchivo();
        this.seleccionarMapa();
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
        mostrarTier.desbloquarTierAnimales(ronda);
        mostrarTier.desbloquarTierComida(ronda);

    }

    private void seleccionarMapa() {
        boolean error = false;
        while (!error) {
            try {
                CampoDeJuego[] campos = new CampoDeJuego[6];
                campos[0] = new CampoDeJuego("Pantano", "Los animales tipo reptil ganarán (+1/+1) por cada animal reptil en batalla");
                campos[1] = new CampoDeJuego("Nubes", "Los animales tipo volador ganarán (+1/+1) por cada animal volador en batalla");
                campos[2] = new CampoDeJuego("Mar", "Los animales de tipo acuático ganarán (+1/+1) por cada animal acuático en batalla");
                campos[3] = new CampoDeJuego("Bosque", "Los animales tipo terrestre tendrán un buff de (+2/0) por cada tipo terrestre\n\tLos animales tipo mamíferos tendrán (0/+2) ");
                campos[4] = new CampoDeJuego("Sabana", "Los Desérticos ganan (0/+1) extra por cada alimento que se les de");
                campos[5] = new CampoDeJuego("Sin Campo", "Los solitarios ganan una bonificación de (+3/+3) si solo hay uno en el equipo");

                System.out.println("Escriba el nombre del mapa donde quiera jugar:");
                for (CampoDeJuego campo : campos) {
                    campo.getDescripcion();
                }

                String nombre = entrada.nextLine();
                error = true;

                OrdenamientoYBusqueda buscar = new OrdenamientoYBusqueda();
                buscar.buscarPorSecuencia(nombre, campos);

            } catch (InputMismatchException e) {
                String errorCometido = entrada.nextLine();
                System.out.println("Valor incorrecto: \"" + errorCometido + "\"");
                System.out.println("Ha ingresado un valor incorrecto!!\nVuelva a intentarlo\n");
            }
        }
    }

    private void iniciarHabilidadesPrimarias() {

    }

    private void dinamicaDesbloqueo(int ronda) {
        Tier desbloquear = new Tier();

        desbloquear.desbloquarTierAnimales(ronda);
        desbloquear.desbloquarTierComida(ronda);
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
