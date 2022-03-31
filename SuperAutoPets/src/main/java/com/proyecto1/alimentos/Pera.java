package com.proyecto1.alimentos;

/**
 *
 * @author michael
 */
public class Pera extends Comida{

    public Pera(String nombre, String descripcion, int darVida, int darDaño) {
        super(nombre, descripcion, darVida, darDaño);
    }

    public Pera(String nombre, String tipoComida, String descripcion, int darVida, int darDaño) {
        super(nombre, tipoComida, descripcion, darVida, darDaño);
    }

    public Pera(String nombre, String tipoComida, String descripion) {
        super(nombre, tipoComida, descripion);
    }
    
}
