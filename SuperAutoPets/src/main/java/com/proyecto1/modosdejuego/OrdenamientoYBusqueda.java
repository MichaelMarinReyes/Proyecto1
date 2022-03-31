package com.proyecto1.modosdejuego;

import com.proyecto1.camposdejuego.CampoDeJuego;
import com.proyecto1.animales.Mascota;

/**
 *
 * @author michael
 */
public class OrdenamientoYBusqueda {

    /**
     * Método para odenar los elementos dependiendo de la elección del usuario,
     * las opciones disponibles son tier, vida o daño ya sea de menor a mayor o
     * viceversa.
     */
    public void ordenarPorCaracteristicas(int opcion, char ascendenteDescendente, Mascota[] equipo) {
        switch (opcion) {
            case 1:
                while (ascendenteDescendente == 'a' || ascendenteDescendente == 'd') {
                    if (ascendenteDescendente == 'a') {
     //                   this.ordenarPorBurbujaAscendente(equipo);
                    } else if (ascendenteDescendente == 'd') {
//                        this.ordenarPorBurbujaDescendente(equipo);
                    }
                    break;
                }

            default:
                System.out.println("Ingrese un valor Correcto");
        }
    }

    /**
     * Método para ordenar los valores de un arreglo de Mascotas de manera
     * Ascendente
     *
     * @param equipo
     */
//    public void ordenarPorBurbujaAscendente(Mascota[] equipo) {
//        for (int i = 0; i < equipo.length; i++) {
//            for (int j = 0; j < equipo.length - 1; j++) {
//                if (equipo[j - 1] > equipo[j]) {
//                    Mascota auxiliar = equipo[j];
//                    equipo[j] = equipo[j - 1];
//                    equipo[j - 1] = auxiliar;
//                }
//            }
//
//        }
//    }

    /**
     * Método para ordenar los valores de un arreglo de Mascotas de manera
     * Descendente
     *
     * @param equipo
     */
//    public void ordenarPorBurbujaDescendente(Mascota[] equipo) {
//        for (int i = 0; i < equipo.length; i++) {
//            for (int j = 0; j < equipo.length - 1; j++) {
//                if (equipo[j - 1] < equipo[j]) {
//                    Mascota auxiliar = equipo[j];
//                    equipo[j] = equipo[j - 1];
//                    equipo[j - 1] = auxiliar;
//                }
//            }
//
//        }
   // }

    /**
     * Método para realizar una busqueda dentro del arreglo de Mascotas
     */
    public void buscarBinariamente(Mascota[] equipo, int tipoABuscar) {
        int indiceInicial = 0;
        int indiceFinal = equipo.length;
        int puntoMedio;
        Mascota caracteristicaEncontrada = null;

        while (indiceInicial <= indiceFinal) {
            puntoMedio = (indiceFinal - indiceInicial) / 2;
            puntoMedio += indiceInicial;
            Mascota caracteristica = equipo[puntoMedio];

            if (tipoABuscar == puntoMedio) {
                caracteristicaEncontrada = caracteristica;
                break;
            } else if (caracteristica.getUnidadDeDaño() == tipoABuscar) {
                indiceInicial = puntoMedio + 1;
            } else {
                indiceFinal = puntoMedio + 1;
            }
        }
    }

    public void buscarPorSecuencia(String nombre, CampoDeJuego[] campos) {
        CampoDeJuego mapaSeleccionado = null;
        for (CampoDeJuego campo : campos) {
            if (campo.verificarNombre(nombre)) {
                mapaSeleccionado = campo;
                break;
            }
        }

        if (mapaSeleccionado != null) {
            System.out.println("Mapa seleccionado: " + mapaSeleccionado);
        } else {
            System.out.println("No se obtuvo resultados");
        }
    }
}
