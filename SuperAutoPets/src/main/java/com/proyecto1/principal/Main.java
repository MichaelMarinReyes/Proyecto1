package com.proyecto1.principal;

import com.proyecto1.jugarodes.Usuario;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\t*********************");
        System.out.println("\t*SUPER\t\t    *");
        System.out.println("\t*\tAUTO\t    *");
        System.out.println("\t*\t\tPETS*");
        System.out.println("\t*********************\n");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombe:");
        String nombre = entrada.nextLine();
        Usuario usuario = new Usuario(10, 0, args, nombre, 10);

        System.out.println("Bienvenido: " + usuario.getNombre() + "\n");

        MenuPrincipal menu = new MenuPrincipal();
        menu.menu();
    }
}
