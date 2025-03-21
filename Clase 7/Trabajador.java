public class Trabajador {
    // atributos
    private int Trabajador;
    private int nombre;
    private int apellido;

    // constructir

    public Trabajador intTrabajador(int idtrabajador, string nombre, string apellido) {
        this.idtrabajador = idtrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // metodos getter

    public int getidTrabajador() {
        return idtrabajador;

    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre() {
        return apellido;
    }

    public double pagar() {
        return 0.0;
    }

    public String toString() {
        return "Trabajador { idTrabajador:" + idTrabajador +
                " Nombre: " + nombre +
                " Apellido: " + apellido + "}";
    }
}
