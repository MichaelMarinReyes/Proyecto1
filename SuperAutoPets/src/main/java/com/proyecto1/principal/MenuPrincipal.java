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

        do {
            System.out.println("\t-MENU PRINCIPAl-");
            System.out.println("\t1. Modos de Juego");
            System.out.println("\t2. Reportes de Juego");
            System.out.println("\t3. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    MenuJuego submenu = new MenuJuego();
                    submenu.mostrarModosDeJuego();
                    break;
                case 2:
                    //llamar al metodo mostrarReportes
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
