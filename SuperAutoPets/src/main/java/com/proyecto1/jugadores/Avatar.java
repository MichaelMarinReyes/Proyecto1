package com.proyecto1.jugadores;

import com.proyecto1.mascotas.Mascota;

/**
 *
 * @author michael
 */
public class Avatar {

    private int vida = 10;
    private int victorias = 0;
    private int monedas = 10;
    private Mascota[] equipo = new Mascota[5];
    private int numeroMascotas;

    public Avatar(int vida, int victorias, Mascota[] equipo) {
        this.vida = vida;
        this.victorias = victorias;
        this.equipo = equipo;
    }

    public Avatar(int numeroMascotasCompradas) {
        equipo = new Mascota[numeroMascotasCompradas];
        numeroMascotasCompradas = 0;
    }

    public Avatar() {

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public Mascota[] getEquipo() {
        for (Mascota mascotas : equipo) {
            System.out.println(mascotas);
        }
        return equipo;
    }

    public void setEquipo(Mascota[] equipo) {
        this.equipo = equipo;
    }

    public boolean indicadorDeVida() {
        return vida > 0;
    }

    /**
     * Verifica si el número de mascotas en el equipo es 0 el usuario no cuenta
     * con mascotas que puedan seguir en batalla.
     *
     * @return
     */
    public boolean equipoVacio() {
        return numeroMascotas == 0;
    }

    /**
     * Indica que la cantidad de mascotas dentro del equipo del usuario esta
     * completo y no se pueden agregar más mascotas.
     *
     * @return
     */
    public boolean indicarEquipoLleno() {
        return numeroMascotas == equipo.length;
    }

    /**
     * Se encarga de agregar una mascota al equipo del usuario, pero verifica
     * antes si hay espacios disponibles o la posición indicada esta libre.
     *
     * @param mascotaNueva
     */
    public void agregarMascota(Mascota mascotaNueva) {
        if (!indicarEquipoLleno()) {
            equipo[numeroMascotas++] = mascotaNueva;
            System.out.println("Mascota agregada al equipo");
        } else {
            System.out.println("El equipo está completo o la posición indicada está ocupada intente nuevamente\n");
        }
    }

    /**
     * Muestra que dado el nombre de una mascota este se encuentra dentro del
     * equipo del usuario y así poder realizar una fusión de la mascota o vender
     * una mascota.
     *
     * @param nombre
     * @return
     */
    public Mascota mostrarMascotaAlmacenada(String nombre) {
        Mascota nombreMascota = null;
        if (!equipoVacio()) {
            for (int i = 0; i < numeroMascotas; i++) {
                if (equipo[i].getNombre().equals(nombre)) {
                    nombreMascota = equipo[i];
                    break;
                }
            }
        }
        return nombreMascota;
    }

    /**
     * Vende una mascota seleccionada por nombre y la cantidad de monedas que el
     * usuario obtiene será igual al nivel que tenga mascota en ese momento de
     * venta.
     *
     * El parámetro nombre es el nombre que el usuario ingresa correspondiente a
     * la mascota que desea vender.
     *
     * @param nombre
     */
    public void vender(String nombre) {

        if (!equipoVacio() && mostrarMascotaAlmacenada(nombre) != null) {
            for (int i = 0; i < numeroMascotas; i++) {
                if (equipo[i].getNombre().equals(nombre)) {
                    if (i == (numeroMascotas - 1)) {
                        setMonedas(getMonedas() + mostrarMascotaAlmacenada(nombre).getNivel());
                        System.out.println("Monedas obtenidas por la venta: " + getMonedas());
                        numeroMascotas--;
                    } else {
                        equipo[i] = equipo[--numeroMascotas];
                        break;
                    }
                }
            }
        } else {
            System.out.println("No se encontro mascota que desea vender, por favor verifique que el nombre\ningresado sea correcto\n");
        }
    }

    public void fusionar(String nombre, int nivel) {
        Mascota mascota = mostrarMascotaAlmacenada(nombre);
        if (!equipoVacio() && mascota != null) {
            mascota.aumentarNivel(1);
        } else {
            System.out.println("No son del mismo tipo las mascotas que desea fusionar");
        }
    }

    private Mascota[] copiarEquipo() {
        Mascota copia[] = new Mascota[numeroMascotas];
        for (int i = 0; i < numeroMascotas; i++) {
            copia[i] = equipo[i];
        }
        return copia;
    }

    public Mascota[] ordenarPorBurbuja(String nombre) {
        Mascota copia[] = copiarEquipo();
        for (int i = 0; i < numeroMascotas; i++) {
            for (int j = i + 1; j < numeroMascotas; j++) {
                if (equipo[i].getNombre().compareTo(equipo[j].getNombre()) < 0) {
                    Mascota auxiliar = copia[i];
                    copia[i] = copia[j];
                    copia[j] = auxiliar;
                }
            }
        }
        return copia;
    }
}
