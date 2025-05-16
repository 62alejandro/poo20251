package Clase9;

public class Camara {
    private String marca;
    private String modelo;
    private double resolucion; // Resolución en megapíxeles

    public Camara(String marca, String modelo, double resolucion) {
        this.marca = marca;
        this.modelo = modelo;
        this.resolucion = resolucion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Camara [Marca: " + marca + ", Modelo: " + modelo + ", Resolución: " + resolucion + " MP]";
    }
}