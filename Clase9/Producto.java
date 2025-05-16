package Clase9;

public class Producto {
    private int id;

    public Producto(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto [ID: " + id + "]";
    }
}