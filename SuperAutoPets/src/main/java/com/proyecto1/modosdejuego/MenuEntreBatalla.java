package com.proyecto1.modosdejuego;

import com.proyecto1.jugadores.Usuario;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class MenuEntreBatalla {

    private final int COSTO = 3;
    private int compra;

    Scanner entrada = new Scanner(System.in);
    Tienda tienda = new Tienda();

    public void mostrarOpcionesDeTienda() {
        int opcion;
        System.out.println("1. Comprar Mascota");
        System.out.println("2. Comprar Comida");
        System.out.println("3. Cambiar opciones de tienda");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                this.comprarMascotas();
                break;
            case 2:
                this.comprarComida();
                break;
            case 3:
                tienda.mostrarMascotasAleatorias();
                tienda.mostrarAlimentosRandom();
                this.mostrarOpcionesDeTienda();
                break;
            default:
                break;
        }
    }

    public void aplicarEfectosPermanentes() {

    }

    public void comprarMascotas() {
        int opcion = 0;

        if (opcion > 0 && opcion <= 2) {
            switch (opcion) {
                case 1:
                    if (5 > 1) {
                        System.out.println("Seleccione la masscota que desse comprar");
                        compra = entrada.nextInt();
                        //usar el método de busqueda para selsccionae el animal a comprar
                        System.out.println("1. Fusionar Mascota\n2. Colocar en un espacio disponible");
                        int fusion = entrada.nextInt();

                        if (fusion <= 2) {
                            if (fusion == 1) {
                                this.fusionarMascotas();
                            } else {
                                //buscar espacio Vacio
                                System.out.println("No cuenta con espacios disponibles, intente nueva mente");
                                this.comprarMascotas();
                            }
                        } else {
                            while (fusion > 2) {
                                System.out.println("Opcion no válida");
                                this.comprarMascotas();
                            }
                        }
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

    public void fusionarMascotas() {

    }
}
