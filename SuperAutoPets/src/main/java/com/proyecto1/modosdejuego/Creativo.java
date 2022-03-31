package com.proyecto1.modosdejuego;

import com.proyecto1.jugadores.Avatar;

/**
 *
 * @author michael
 */
public class Creativo {

    private Avatar usuario;
    private Avatar jugador2;

    public void comenzarJuego() {
        Batalla jugar = new Batalla();
        MenuEntreBatalla submenu = new MenuEntreBatalla();
        submenu.mostrarOpcionesDeTiendaVersusYCreativo();
        jugar.jugarVersus();
    }
}
