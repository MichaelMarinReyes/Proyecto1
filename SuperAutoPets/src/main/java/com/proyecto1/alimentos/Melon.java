package com.proyecto1.alimentos;

/**
 *
 * @author michael
 */
public class Melon extends Comida {

    public Melon(String nombre, String descripcion, int darVida, int darDaño) {
        super(nombre, descripcion, darVida, darDaño);
    }

    public Melon(String nombre, String tipoComida, String descripcion, int darVida, int darDaño) {
        super(nombre, tipoComida, descripcion, darVida, darDaño);
    }

    public Melon(String nombre, String tipoComida, String descripion) {
        super(nombre, tipoComida, descripion);
    }
    
}
