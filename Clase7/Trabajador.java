public class Trabajador {
    // atributos
    private int idtrabajador;
    private String nombre;
    private String apellido;

    // constructor
    public Trabajador(int idtrabajador, String nombre, String apellido) {
        this.idtrabajador = idtrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // métodos getter
    public int getIdTrabajador() {
        return idtrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // método pagar
    public double pagar() {
        return 0.0;
    }

    // método toString
    @Override
    public String toString() {
        return "Trabajador { idTrabajador: " + idtrabajador +
                ", Nombre: " + nombre +
                ", Apellido: " + apellido + " }";
    }
}