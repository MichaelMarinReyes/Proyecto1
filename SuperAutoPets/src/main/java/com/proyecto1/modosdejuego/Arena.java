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
    private int rondas;

    public void comenzarActividadJuego() {
        Batalla jugar = new Batalla();
        MenuEntreBatalla submenu = new MenuEntreBatalla();
        submenu.mostrarOpcionesDeTienda();
//        jugar.comenzarBatalla();
//        jugar.iniciarHabilidadesPrimarias();
//        jugar.indicarPerdedorGanador();
//        jugar.indicarPerdedorGanador();
    }


    public void restarVida() {

    }

}
