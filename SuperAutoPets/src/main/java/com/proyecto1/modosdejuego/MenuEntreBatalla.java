package com.proyecto1.modosdejuego;

import com.proyecto1.animales.Mascota;
import com.proyecto1.jugadores.Usuario;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class MenuEntreBatalla {
    private int ronda;

    private final int COSTO = 3;

    Scanner entrada = new Scanner(System.in);
    Tienda tienda = new Tienda();
    Batalla jugar = new Batalla();
    Usuario usuario = new Usuario();
    Mascota equipo[] = new Mascota[5];
    Mascota mascota = new Mascota();
    
    public void mostrarOpcionesDeTienda() {

        boolean error = false;

        while (!error) {
            try {
                while (usuario.getVida() > 0) {
                    tienda.mostrarMascotasAleatorias();
                    tienda.mostrarAlimentosRandom();
                    System.out.println("1. Comprar Mascota\t2. Comprar Comida\t3. Cambiar opciones de tienda\t4. Jugar");
                    int opcion = entrada.nextInt();
                    error = true;

                    switch (opcion) {
                        case 1:
                            while (usuario.getVida() >= 3) {
                                this.comprarMascotas();
                            }
                            System.out.println("No cuentas con suficiente monedas para comprar");
                            this.mostrarOpcionesDeTienda();
                            break;
                        case 2:
                            while (usuario.getOro() >= 3) {
                                this.comprarComida();
                            }
                            System.out.println("No cuentas con suficientes monedas para comprar");
                            this.mostrarOpcionesDeTienda();
                            break;
                        case 3:
                            while (usuario.getOro() >= 1) {
                                tienda.mostrarMascotasAleatorias();
                                tienda.mostrarAlimentosRandom();
                                this.mostrarOpcionesDeTienda();
                            }
                            break;
                        case 4:
                            jugar.jugar();
                        break;
                        default:
                            while (opcion > 4) {
                                System.out.println("\tNúmero de opción ingresado inválido\nVuela a intentarlo\n");
                                this.mostrarOpcionesDeTienda();
                            }
                            break;
                    }
                }
                System.out.println("Ya no tienes puntos de vida para seguir luchando");
                System.out.println("1. Volver a jugar\t2. Menú Principal\t 3. Menú Principal");
                int desicion = entrada.nextInt();
                error = true;

                if (desicion == 1) {
                    this.mostrarOpcionesDeTienda();
                } else {
                }
            } catch (InputMismatchException e) {
                String errorCometido = entrada.nextLine();
                System.out.println("Valor incorrecto: \"" + errorCometido + "\"");
                System.out.println("Ha ingresado un valor incorrecto!!\nVuelva a intentarlo\n");
            }
        }
    }

    public void aplicarEfectosPermanentes() {

    }

    public void comprarMascotas() {
        int opcion = 0;
        boolean error = false;

        while (!error) {
            try {
                if (opcion > 0 && opcion <= 2) {
                    switch (opcion) {
                        case 1:
                            if (5 > 1) {
                                System.out.println("Seleccione la mascota que desse comprar");
                                int compra = entrada.nextInt();
                                //ENVIAR EL PARAMETRO COMPRA A LA BUSQUEDA PARA COMPRARLO
                                System.out.println("1. Fusionar Mascota\n2. Colocar en un espacio disponible");
                                int animalSeleccionado = entrada.nextInt();
                                error = true;
                                
                                if (animalSeleccionado <= 2) {
                                    if (animalSeleccionado == 1) {
                                        this.fusionarMascotas();
                                    } else if (animalSeleccionado == 2){
                                        this.posicionarAnimalComprado();
                                        //buscar espacio Vacio
                                        
                                        
                                        System.out.println("No cuenta con espacios disponibles, intente nueva mente");
                                        this.comprarMascotas();
                                    }
                                } else {
                                    while (animalSeleccionado > 2) {
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
            } catch (Exception e) {
                String errorCometido = entrada.nextLine();
                System.out.println("Valor incorrecto: \"" + errorCometido + "\"");
                System.out.println("Ha ingresado un valor incorrecto!!\nVuelva a intentarlo\n");
            }
        }

    }

    public void comprarComida() {
        Tienda comida = new Tienda();
        comida.mostrarAlimentosRandom();
    }

    public void copiarArreglo() {

    }

    public void seleccionarCampo() {

    }

    public void venderMascotas() {

    }

    public void fusionarMascotas() {

    }

    public void posicionarAnimalComprado() {
        int posicion;
        

        System.out.println("Ingrese la posición donde quiere colocar la mascota");
        System.out.println("La posición se debe indicar con números del 1 al 5");
        posicion = entrada.nextInt();

        if (posicion <= 5) {
//            equipo[posicion] = ;
        } else {
            while (posicion > 5) {
                System.out.println("\tValor ingresado incorrecto\nVuelva a Intentarlo\n");
                this.posicionarAnimalComprado();
            }
        }
    }
}
