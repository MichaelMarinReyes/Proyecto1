package com.proyecto1.superautopets;

import com.proyecto1.superautopets.modosdejuego.MenuModoJuego;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class MenuPrincipal {

    private int opcion;
    Scanner entrada = new Scanner(System.in);

    public void Menu() {

        do {
            System.out.println("-MENU PRINCIPAl-");
            System.out.println("1. Modos de Juego");
            System.out.println("2. Reportes de Juego");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    MenuModoJuego menu = new MenuModoJuego();
                    menu.llamarModoDeJuego();

                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("*Saliendo del Juego*");
                    break;
                default:
                    System.out.println("Valor ingresado incorrecto\nVuelva a Intentarlo");
            }

        } while (opcion != 3);

    }
}
