package com.proyecto1.jugadores;

import com.proyecto1.mascotas.Mascota;

/**
 *
 * @author michael
 */
public class Computadora extends Avatar{
    private final String NOMBRE_IA = "Computadora";

    public Computadora(int vida, int victorias, Mascota[] equipo) {
        super(vida, victorias, equipo);
    }

    public Computadora() {
    }


}
