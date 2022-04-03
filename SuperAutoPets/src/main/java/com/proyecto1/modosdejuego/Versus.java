package com.proyecto1.modosdejuego;

import com.proyecto1.jugadores.Avatar;
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class Versus {

    private Avatar usuario;
    private Avatar jugadorImportado;

    Scanner entrada = new Scanner(System.in);

    public void comenzarJuego() {
        Batalla jugar = new Batalla();
        
        System.out.println("-MODO DE JUEGO ARENA-");
        MenuEntreBatalla submenu = new MenuEntreBatalla();
        submenu.mostrarOpcionesDeTiendaVersusYCreativo();
        jugar.jugarVersus();
    }
}
