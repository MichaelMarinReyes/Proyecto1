package com.proyecto1.modosdejuego;

import com.proyecto1.alimentos.Comida;
import com.proyecto1.animales.Mascota;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class Tienda {

    private Mascota[] animalesTienda;
    private Comida[] comidaTienda;
    private int ronda = 1;
    private String[] tipo = {"Insecto", "Terrestre"};
    private boolean error = false;

    Scanner entrada = new Scanner(System.in);
    Tier mostrarTier = new Tier();

    /**
     * Se encarga de pasar el parámetro de ronda al método
     * desbloquearTierAnimales() que se encuntra en la clase Tier.
     *
     * @param ronda
     */
    public void mostrarMascotasAleatorias(int ronda) {
        mostrarTier.desbloquearTierMascota(ronda);
    }

    /**
     * Se encarga de pasarle el parámetro de ronda al método
     * desbloquearTierComida(int ronda) que se se encuentra en la clase Tier.
     *
     * @param ronda
     */
    public void mostrarComidaAleatoria(int ronda) {
        mostrarTier.desbloquerTierComida(ronda);
    }

    /**
     * Se encarga de mostrar al usuario un submenú para que pueda comprar un
     * animal y agregarlo a un espacio disponible o fusionarlo con alguno de los
     * animales que el usuario tenga.
     */
    public void comprarMascotas() {
        while (!error) {
            try {
                System.out.println("1. Fusionar mascota a comprar con una del equipo");
                System.out.println("2. Agregar mascota a espacio disponible");
                int compra = entrada.nextInt();
                error = true;

                if (compra == 1) {
                    this.fusionarMascotas();
                } else {
                    System.out.println("Escriba el nombre de mascota que desea agregar al equipo");
                    String nombre = entrada.nextLine();
                    //BUSCAR POR NOMBRE EL ANIMAL APLICANDO BUrbuja

                }
            } catch (InputMismatchException e) {
                String errorCometido = entrada.nextLine();
                System.out.println("Valor incorrecto: \"" + errorCometido + "\"");
                System.out.println("Ha ingresado un valor incorrecto!!\nVuelva a intentarlo\n");
            }
        }
    }

    /**
     * Se encarga de mostrar el usuario un submenú para que pueda comprar un
     * tipo de comida y aplicarlo a alguna mascota que él usuario tenga en el
     * equipo.
     */
    public void comprarComida() {

    }

    /**
     * Se encarga de fusionar dos mascotas para aumentar en nivel del mismo.
     */
    public void fusionarMascotas() {
        System.out.println("Ingrese el nombre de la mascota que desea fusionar");
        String eleccion = entrada.nextLine();

        // Busqueda binaria
    }
}