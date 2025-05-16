package Clase9;

public class Pedido {
    // Atributos
    private Cliente cliente; // Cambié "cliente" a "Cliente"
    private Producto[] productos; // Cambié "producto" a "Producto" y renombré a "productos"
    private int numeroTarjetaCredito;

    // Constructor
    public Pedido(Cliente cliente, Producto[] productos, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    // Métodos
    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }
}