package com.proyecto1.principal;

import com.proyecto1.modosdejuego.*;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author michael
 */
public class MenuPrincipal {

    private int opcion;
    Scanner entrada = new Scanner(System.in);

    public void mostrarMenuPrincipal() {
        boolean error = false;

        while (!error) {
            try {
                System.out.println("\t-MENU PRINCIPAl-");
                System.out.println("\t1. Arena");
                System.out.println("\t2. Versus");
                System.out.println("\t3. Creativo");
                System.out.println("\t4. Reportes de Juego");
                System.out.println("\t5. Salir");
                opcion = entrada.nextInt();
                error = true;

                if (opcion <= 5) {
                    switch (opcion) {
                        case 1:
                            System.out.println("-------------------------------");
                            Arena arena = new Arena();
                            arena.comenzarActividadJuego();
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            Versus versus = new Versus();
                            versus.comenzarJuego();
                            break;
                        case 3:
                            System.out.println("-------------------------------");
                            Creativo creativo = new Creativo();
                            creativo.comenzarJuego();
                            break;
                        case 4:
                            //REPORTES
                            break;
                        case 5:
                            System.out.println("-------------------------------");
                            System.out.println("*Saliendo del Juego*");
                        default:
                            System.out.println("\tValor ingresado incorrecto\n\tVuelva a Intentarlo\n");
                            this.mostrarMenuPrincipal();
                            break;
                    }
                } else {
                    while (opcion > 5) {
                        this.mostrarMenuPrincipal();
                    }
                }

            } catch (InputMismatchException e) {
                String errorCometido = entrada.nextLine();
                System.out.println("Valor incorrecto: \"" + errorCometido + "\"");
                System.out.println("Ha ingresado un valor incorrecto!!\nVuelva a intentarlo\n");
            }

        }

    }
}
