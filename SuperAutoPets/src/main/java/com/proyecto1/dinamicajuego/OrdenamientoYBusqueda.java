package com.proyecto1.dinamicajuego;

import com.proyecto1.animales.Mascota;
import com.proyecto1.camposdejuego.CampoDeJuego;

/**
 *
 * @author michael
 */
public class OrdenamientoYBusqueda {

    /**
     * Método para ordenar los valores de un arreglo de Mascotas de manera El
     * parametro equipo es de tipo Mascota que significa de que tipo es el
     * arreglo
     *
     * @param equipo
     */
    public void ordenarPorBurbuja(Mascota[] equipo) {
        for (int i = 0; i < equipo.length; i++) {
            for (int j = 0; j < equipo.length - 1; j++) {
                if (equipo[j - 1].getNombre().compareTo(equipo[j].getNombre()) < 0) {
                    Mascota auxiliar = equipo[j];
                    equipo[j] = equipo[j - 1];
                    equipo[j - 1] = auxiliar;
                }
            }

        }
    }

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
