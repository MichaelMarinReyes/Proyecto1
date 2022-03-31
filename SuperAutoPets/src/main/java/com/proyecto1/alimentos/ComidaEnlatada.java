package com.proyecto1.alimentos;

/**
 *
 * @author michael
 */
public class ComidaEnlatada extends Comida{

    public ComidaEnlatada(String nombre, String descripcion, int darVida, int darDaño) {
        super(nombre, descripcion, darVida, darDaño);
    }

    public ComidaEnlatada(String nombre, String tipoComida, String descripcion, int darVida, int darDaño) {
        super(nombre, tipoComida, descripcion, darVida, darDaño);
    }

    public ComidaEnlatada(String nombre, String tipoComida, String descripion) {
        super(nombre, tipoComida, descripion);
    }
    
}
