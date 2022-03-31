package com.proyecto1.alimentos;

/**
 *
 * @author michael
 */
public class Manzana extends Comida {

    public Manzana(String nombre, String descripcion, int darVida, int darDaño) {
        super(nombre, descripcion, darVida, darDaño);
    }

    public Manzana(String nombre, String tipoComida, String descripcion, int darVida, int darDaño) {
        super(nombre, tipoComida, descripcion, darVida, darDaño);
    }

    public Manzana(String nombre, String tipoComida, String descripion) {
        super(nombre, tipoComida, descripion);
    }

}
