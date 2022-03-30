package com.proyecto1.modosdejuego;

import com.proyecto1.jugadores.Avatar;
import com.proyecto1.jugadores.Computadora;

/**
 *
 * @author michael
 */
public class Arena {

    private Avatar usuario;
    private Computadora boot;
    private int ronda;

    public void comenzarActividadJuego() {
        Batalla jugar = new Batalla();
        MenuEntreBatalla submenu = new MenuEntreBatalla();
        submenu.mostrarOpcionesDeTiendaArena();
        jugar.comenzarBatalla();
    }



}
