package com.proyecto1.modosdejuego;



/**
 *
 * @author michael
 */
public class Arena {

    private int rondas;

    public void comenzarActividadJuego() {
        Batalla jugar = new Batalla();
        jugar.comenzarBatalla();
        jugar.iniciarHabilidadesPrimarias();
        jugar.indicarPerdedorGanador();
        jugar.indicarPerdedorGanador();
    }


    public void restarVida() {

    }

}
