public class EjecutarHerencia {

    public static void main(String[] args) {

        // Arreglo de trabajadores (tamaño corregido)
        Trabajador[] t = new Trabajador[3];

        // Creación de los objetos (Instanciar)
        t[0] = new Operario(1, "Pepito", "Puertas", 135.0);
        t[1] = new Consultor(2, "Juan", "Islas", 10);
        t[2] = new Consultor(3, "Byron", "Cano", 20);

        // Iterar y mostrar información
        for (Trabajador x : t) {
            System.out.println(x.getClass().getSimpleName() + " - " + x.pagar());
        }
    }
}