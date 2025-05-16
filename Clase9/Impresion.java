package Clase9;

public class Impresion {
    private String tipo;
    private Foto[] fotos;
    private int cantidad;

    public Impresion(String tipo, Foto[] fotos, int cantidad) {
        this.tipo = tipo;
        this.fotos = fotos;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Impresion [Tipo: ").append(tipo).append(", Cantidad: ").append(cantidad).append(", Fotos: ");
        if (fotos != null) {
            for (Foto foto : fotos) {
                sb.append(foto.toString()).append(" ");
            }
        } else {
            sb.append("No hay fotos");
        }
        sb.append("]");
        return sb.toString();
    }
}