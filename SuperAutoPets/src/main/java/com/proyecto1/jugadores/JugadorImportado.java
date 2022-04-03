package com.proyecto1.jugadores;

import com.proyecto1.mascotas.Mascota;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class JugadorImportado extends Avatar {
    
    Scanner entrada = new Scanner(System.in);

    public JugadorImportado(int vida, int victorias, Mascota[] equipo) {
        super(vida, victorias, equipo);
    }
    
    public JugadorImportado() {
        
    }

    public void leerArchivo() {
        System.out.println("Ingrese la dirección donde se encuentra el archivo a leer");
        String path = entrada.nextLine();
        
        File file = new File(path);
        
        try {
            Scanner entradaArchivo = new Scanner(file);
            while (entradaArchivo.hasNextLine()) {
                System.out.println(entradaArchivo.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("no se encontro el archivo, verifique que la dirección ingresada sea correcta");
            this.leerArchivo();
        }
    }
    
}
