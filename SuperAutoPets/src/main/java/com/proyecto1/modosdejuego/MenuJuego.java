package com.proyecto1.modosdejuego;

import com.proyecto1.principal.MenuPrincipal;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class MenuJuego {

    private int opcion;

    Scanner entrada = new Scanner(System.in);

    public void mostrarModosDeJuego() {
        do {
            System.out.println("\t**MENU DE MODOS DE JUEGO**\n\tSeleccione que tipo de partida desea jugar\n");
            System.out.println("\t1. ARENA");
            System.out.println("\t2. VERSUS");
            System.out.println("\t3. CREATIVO");
            System.out.println("\t4. REGRESAR AL MENU PRINCIPAL");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    //ir al modo arena
                    break;
                case 2:
                    //ir al modo versus
                    break;
                case 3: // ir al modo creativo
                    break;
                case 4:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Regresando al MENU PRINCIPAL...");
                    }
                    System.out.println("");
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.menu();

                    break;
                default:
                    System.out.println("Número de opción ingresado inválido\nVuela a intentarlo");
            }

        } while (opcion != 4);
    }
}