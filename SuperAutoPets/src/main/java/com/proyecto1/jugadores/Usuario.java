package com.proyecto1.jugadores;

import com.proyecto1.animales.Mascota;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class Usuario extends Avatar {

    private String nombre;
    private int oro = 10;

    Scanner entrada = new Scanner(System.in);

    public Usuario(int vida, int victorias, Mascota[] equipo, String nombre) {
        super(vida, victorias, equipo);
        this.nombre = nombre;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public void escribirArchivo() {
        System.out.println("Ingrese la dirección donde desea guardar el archivo");
        String path = entrada.nextLine();

        File fileDestino = new File(path);

        try {
            PrintWriter printer = new PrintWriter(fileDestino);
            //ARREGLO DE MASCOTAS
            
            printer.println(super.getEquipo());
            printer.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro la dirección ingresada");
            this.escribirArchivo();
        }
    }
}
