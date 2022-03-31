package com.proyecto1.camposdejuego;

/**
 *
 * @author michael
 */
public class CampoDeJuego {

    private String descripcion;
    private String nombre;

    public CampoDeJuego() {

    }

    public CampoDeJuego(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "*"+nombre+"*" + "\n\t{" + descripcion+"}\n";
    }

    public void getDescripcion(){
        System.out.println(toString());
    }
    
    public boolean verificarNombre (String nombreSeleccionado) {
        return nombre.equals(nombreSeleccionado);
    }
    
}
