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
        submenu.mostrarOpcionesDeTienda();
//        jugar.comenzarBatalla();
//        jugar.iniciarHabilidadesPrimarias();
//        jugar.indicarPerdedorGanador();
//        jugar.indicarPerdedorGanador();
    }

    /**
     * Si el usuario se queda sin mascotas para la batalla se le resta vida
     * dependiendo de la ronda en que este.
     */
    public void restarVida() {

        if (ronda >= 1 && ronda <= 3) {
            usuario.setVida(usuario.getVida() - 1);
        } else if (ronda >= 4 && ronda <= 6) {
            usuario.setVida(usuario.getVida() - 2);
        } else {
            usuario.setVida(usuario.getVida() - 3);
        }

    }

}
