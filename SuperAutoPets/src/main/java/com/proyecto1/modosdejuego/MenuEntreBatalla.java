package com.proyecto1.modosdejuego;

import com.proyecto1.animales.Mascota;
import com.proyecto1.camposdejuego.CampoDeJuego;
import com.proyecto1.jugadores.Usuario;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class MenuEntreBatalla {

    private final int COSTO = 3;
    private int ronda = 1;

    Scanner entrada = new Scanner(System.in);
    Tienda tienda = new Tienda();
    Batalla jugar = new Batalla();
    Usuario usuario = new Usuario();
    Mascota equipo[] = new Mascota[5];
    Mascota mascota = new Mascota();

    public void mostrarOpcionesDeTiendaArena() {

        boolean error = false;

        while (!error) {
            try {
                while (usuario.getVida() > 0) {
                    System.out.println("-MENÚ DE TURNO-");
                    System.out.println("Equipo: ");
//                    usuario.getEquipo();
                    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("Comida disponible: ");
                    tienda.mostrarAlimentosRandom();
                    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("Mascotas disponibles:");
                    tienda.mostrarMascotasAleatorias();
                    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("1. Comprar Mascota\t2. Comprar Comida\t3. Cambiar opciones de tienda\t4. Jugar");
                    int opcion = entrada.nextInt();
                    error = true;

                    switch (opcion) {
                        case 1:
                            while (usuario.getVida() >= 3) {
                                this.comprarMascotas();
                            }
                            System.out.println("No cuentas con suficiente monedas para comprar");
                            this.mostrarOpcionesDeTiendaArena();
                            break;
                        case 2:
                            while (usuario.getOro() >= 3) {
                                this.comprarComida();
                            }
                            System.out.println("No cuentas con suficientes monedas para comprar");
                            this.mostrarOpcionesDeTiendaArena();
                            break;
                        case 3:
                            while (usuario.getOro() >= 1) {
                                tienda.mostrarMascotasAleatorias();
                                tienda.mostrarAlimentosRandom();
                                this.mostrarOpcionesDeTiendaArena();
                            }
                            break;
                        case 4:
                            this.seleccionarMapa();
                            jugar.jugarArena();
                            ronda++;
                            break;
                        default:
                            while (opcion > 4) {
                                System.out.println("\tNúmero de opción ingresado inválido\nVuela a intentarlo\n");
                                this.mostrarOpcionesDeTiendaArena();
                            }
                            break;
                    }
                }
                System.out.println("Ya no tienes puntos de vida para seguir luchando");
                System.out.println("1. Volver a jugar\t2. Menú Principal\t 3. Menú Principal");
                int desicion = entrada.nextInt();
                error = true;

                if (desicion == 1) {
                    this.mostrarOpcionesDeTiendaArena();
                } else {
                }
            } catch (InputMismatchException e) {
                String errorCometido = entrada.nextLine();
                System.out.println("Valor incorrecto: \"" + errorCometido + "\"");
                System.out.println("Ha ingresado un valor incorrecto!!\nVuelva a intentarlo\n");
            }
        }
    }

    public void mostrarOpcionesDeTiendaVersusYCreativo() {

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
                            this.mostrarOpcionesDeTiendaArena();
                            break;
                        case 2:
                            while (usuario.getOro() >= 3) {
                                this.comprarComida();
                            }
                            System.out.println("No cuentas con suficientes monedas para comprar");
                            this.mostrarOpcionesDeTiendaArena();
                            break;
                        case 3:
                            while (usuario.getOro() >= 1) {
                                tienda.mostrarMascotasAleatorias();
                                tienda.mostrarAlimentosRandom();
                                this.mostrarOpcionesDeTiendaArena();
                            }
                            break;
                        case 4:
                            jugar.jugarVersus();
                            break;
                        default:
                            while (opcion > 4) {
                                System.out.println("\tNúmero de opción ingresado inválido\nVuela a intentarlo\n");
                                this.mostrarOpcionesDeTiendaArena();
                            }
                            break;
                    }
                }
                System.out.println("Ya no tienes puntos de vida para seguir luchando");
                System.out.println("1. Volver a jugar\t2. Menú Principal\t 3. Menú Principal");
                int desicion = entrada.nextInt();
                error = true;

                if (desicion == 1) {
                    this.mostrarOpcionesDeTiendaArena();
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
                                    } else if (animalSeleccionado == 2) {
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


                for (CampoDeJuego campo : campos) {
                    campo.getDescripcion();
                }
                System.out.println("Escriba el nombre del mapa donde quiera jugar:");
                String nombre = entrada.nextLine();
                error = true;

                OrdenamientoYBusqueda buscar = new OrdenamientoYBusqueda();
//                buscar.buscarPorSecuencia(nombre, campos);

            } catch (InputMismatchException e) {
                String errorCometido = entrada.nextLine();
                System.out.println("Valor incorrecto: \"" + errorCometido + "\"");
                System.out.println("Ha ingresado un valor incorrecto!!\nVuelva a intentarlo\n");
            }
        }
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
