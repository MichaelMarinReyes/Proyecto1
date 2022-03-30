package com.proyecto1.modosdejuego;

/**
 *
 * @author michael
 */
public class Creativo {

    public void comenzarJuego() {
        Batalla jugar = new Batalla();
        MenuEntreBatalla submenu = new MenuEntreBatalla();
        submenu.mostrarOpcionesDeTiendaVersusYCreativo();
        jugar.comenzarBatalla();
    }
}
