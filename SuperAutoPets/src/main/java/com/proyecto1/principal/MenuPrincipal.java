package com.proyecto1.principal;

import java.util.Scanner;
import com.proyecto1.modosdejuego.MenuJuego;

/**
 *
 * @author michael
 */
public class MenuPrincipal {

    private int opcion;
    Scanner entrada = new Scanner(System.in);

    public void menu() {

        System.out.println("\t-MENU PRINCIPAl-");
        System.out.println("\t1. Modos de Juego");
        System.out.println("\t2. Reportes de Juego");
        System.out.println("\t3. Salir");
        opcion = entrada.nextInt();

        if (opcion <= 3) {
            switch (opcion) {
                case 1:
                    System.out.println("-------------------------------");
                    MenuJuego submenu = new MenuJuego();
                    submenu.mostrarModosDeJuego();
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    //llamar al metodo mostrarReportes
                    break;
                default:
                    System.out.println("-------------------------------");
                    System.out.println("*Saliendo del Juego*");
                    break;
            }
        } else {
            while (opcion > 3) {
                System.out.println("\tValor ingresado incorrecto\nVuelva a Intentarlo\n");
                this.menu();
            }
        }
    }
}
