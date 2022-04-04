package com.proyecto1.modosdejuego;

import com.proyecto1.mascotas.Mascota;
import com.proyecto1.jugadores.Usuario;
import com.proyecto1.principal.MenuPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class MenuEntreBatalla {

    private int ronda = 1;
    private Mascota[] equipo;

    Scanner entrada = new Scanner(System.in);
    Tienda tienda = new Tienda();
    Batalla jugar = new Batalla();
    Usuario usuario = new Usuario();
    Mascota mascota = new Mascota();
    MenuPrincipal menuPrincipal = new MenuPrincipal();

    public void mostrarOpcionesDeTiendaArena() {

        boolean error = false;

        while (!error) {
            try {
                while (usuario.getVida() > 0) {
                    System.out.println("-MENÚ DE TURNO-");
                    System.out.println("Monedas: " + usuario.getMonedas());
                    System.out.println("Equipo: ");
//                    usuario.getEquipo();
                    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("Comida disponible: ");
                    tienda.mostrarComidaAleatoria(ronda);
                    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("Mascotas disponibles:");
                    tienda.mostrarMascotasAleatorias(ronda);
                    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("1. Comprar Mascota\t2. Vender Mascota\t 3.Comprar Comida\t4. Cambiar opciones de tienda\t5. Jugar");
                    int opcion = entrada.nextInt();
                    error = true;

                    switch (opcion) {
                        case 1:
                            while (usuario.getMonedas() >= 3) {
                                tienda.comprarMascotas();
                            }
                            System.out.println("No cuentas con suficiente monedas para comprar");
                            this.mostrarOpcionesDeTiendaArena();
                            break;
                        case 2:
                            this.venderMascotas();
                            break;
                        case 3:
                            while (usuario.getMonedas() >= 3) {

                                tienda.comprarComida();
                                break;
                            }

                            System.out.println("No cuentas con suficientes monedas para comprar");
                            this.mostrarOpcionesDeTiendaArena();
                            break;
                        case 4:
                            if (usuario.getMonedas() >= 1) {
                                while (usuario.getMonedas() >= 1) {
                                    usuario.setMonedas(usuario.getMonedas() - 1);
                                    tienda.mostrarMascotasAleatorias(ronda);
                                    tienda.mostrarComidaAleatoria(ronda);
                                    this.mostrarOpcionesDeTiendaArena();
                                }
                            } else {
                                System.out.println("no cuentas con suficientes monedas para cambiar las opciones de tienda");
                            }
                            break;
                        case 5:
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
                System.out.println("1. Volver a jugar\t2. Menú Principal");
                int desicion = entrada.nextInt();
                error = true;

                if (desicion == 1) {
                    this.mostrarOpcionesDeTiendaArena();
                } else {
                    menuPrincipal.mostrarMenuPrincipal();
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
                    System.out.println("-MENÚ DE TURNO-");
                    System.out.println("Monedas: " + usuario.getMonedas());
                    System.out.println("Equipo: ");
//                    usuario.getEquipo();
                    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("Comida disponible: ");
                    tienda.mostrarComidaAleatoria(ronda);
                    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("Mascotas disponibles:");
                    tienda.mostrarMascotasAleatorias(ronda);
                    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    System.out.println("1. Comprar Mascota\t2. Vender Mascota\t 3.Comprar Comida\t4. Cambiar opciones de tienda\t5. Jugar");
                    int opcion = entrada.nextInt();
                    error = true;

                    switch (opcion) {
                        case 1:
                            while (usuario.getMonedas() >= 3) {
                                tienda.comprarMascotas();
                            }
                            System.out.println("No cuentas con suficiente monedas para comprar");
                            this.mostrarOpcionesDeTiendaArena();
                            break;
                        case 2:
                            this.venderMascotas();
                            break;
                        case 3:
                            while (usuario.getMonedas() >= 3) {
                                tienda.comprarComida();
                                break;
                            }
                        case 4:
                            if (usuario.getMonedas() >= 1) {
                                while (usuario.getMonedas() >= 1) {
                                    usuario.setMonedas(usuario.getMonedas() - 1);
                                    tienda.mostrarMascotasAleatorias(ronda);
                                    tienda.mostrarComidaAleatoria(ronda);
                                    this.mostrarOpcionesDeTiendaArena();
                                }
                            } else {
                                System.out.println("no cuentas con suficientes monedas para cambiar las opciones de tienda");
                            }
                            break;
                        case 5:
                            jugar.jugarVersus();
                            ronda++;
                            break;
                        default:
                            while (opcion > 5) {
                                System.out.println("\tNúmero de opción ingresado inválido\nVuela a intentarlo\n");
                                this.mostrarOpcionesDeTiendaArena();
                            }
                            break;

                    }
                    System.out.println("Ya no tienes puntos de vida para seguir luchando");
                    System.out.println("1. Volver a jugar\t2. Menú Principal");
                    int desicion = entrada.nextInt();
                    error = true;

                    if (desicion == 1) {
                        this.mostrarOpcionesDeTiendaArena();
                    } else {
                        menuPrincipal.mostrarMenuPrincipal();
                    }
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

    public void venderMascotas() {
        System.out.println("Ingrese el nombre de la mascota que desea vender");
        String venta = entrada.nextLine();
        
        usuario.vender(venta);
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

    public void copiarMascotasMostradosEnTienda() {

    }
}
