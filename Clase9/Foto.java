package Clase9;

public class Foto {
    private String nombre;

    public Foto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Foto: " + nombre;
    }
}