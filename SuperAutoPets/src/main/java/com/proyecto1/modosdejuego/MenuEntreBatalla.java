package com.proyecto1.modosdejuego;

import com.proyecto1.jugadores.Usuario;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class MenuEntreBatalla {

    private final int COSTO = 3;
    private int opcion;
    private int compra;

    Scanner entrada = new Scanner(System.in);

    public void aplicarEfectosPermanentes() {

    }

    public void comprarMascotas() {
        System.out.println("1. ComprarMascotas");
        System.out.println("2. Cambiar opciones de la tienda");
        Usuario usuario = new Usuario();
        Tienda animales = new Tienda();

        if (opcion > 0 && opcion <= 2) {
            switch (opcion) {
                case 1:
                    if (usuario.getOro() > 1) {
                        animales.mostrarMascotasAleatorias();
                        System.out.println("Seleccione la masscota que desse comprar");
                        compra = entrada.nextInt();
                        //usar el método de busqueda para selsccionae el animal a comprar
                        if (usuario.getOro() >= 3) {
                            System.out.println("Compra Realizada con éxito");
                        } else {
                            System.out.println("No se compro ningún animal, no cuentas con suficientes monedas");
                        }
                    }
                    break;

                case 2:
                    if (usuario.getOro() >= 1) {
                        animales.mostrarMascotasAleatorias();
                        animales.mostrarAlimentosRandom();
                    } else {
                        System.out.println("No cuentas con suficientes monedas para realizar esta acción");
                    }
                    break;
                default:
                    System.out.println("Opción ingresada inválida");
                    break;
            }
        } else {
            while (opcion > 3) {
                System.out.println("\tValor ingresado incorrecto\nVuelva a Intentarlo\n");

            }
        }
    }

    public void comprarComida() {
        Tienda comida = new Tienda();
        comida.mostrarAlimentosRandom();
    }

    public void ordenarMascotas() {

    }

    public void seleccionarCampo() {

    }

    public void venderMascotas() {

    }
}
