public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Dado un arreglo A de N elementos, almacenar los elementos mayores y menores
         * que la media, almacenarlos en arreglos diferentes.
         * 
         * Análisis: necesitamos crear el arreglo de tamaño aleatorio y generar números
         * aleatorios para que sean almacenados en el arreglo, posteriormente obtenemos
         * la media del arreglo y comparamos cada posición del arreglo para determinar
         * si es mayor o menor a la media.
         */

        // n será el número aleatorio para el tamaño del arreglo (entre 5 y 15)
        int n = (int) (Math.random() * (15 - 5 + 1)) + 5;

        // Declarar el arreglo
        int[] a = new int[n];

        // Llenar el arreglo con números aleatorios entre 0 y 50.
        System.out.print("Arreglo original: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 51); // Números entre 0 y 50
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Calcular la media del arreglo
        int sumaArreglo = 0;
        for (int i = 0; i < a.length; i++) {
            sumaArreglo += a[i];
        }

        double media = (double) sumaArreglo / a.length; // Conversión a double para precisión
        System.out.println("Media del arreglo: " + media);

        // Contar cuántos elementos son mayores o menores que la media
        int contadorMayorMedia = 0, contadorMenorMedia = 0;
        for (int num : a) {
            if (num >= media) {
                contadorMayorMedia++;
            } else {
                contadorMenorMedia++;
            }
        }

        // Crear los arreglos para almacenar los números mayores y menores a la media
        int[] mayores = new int[contadorMayorMedia];
        int[] menores = new int[contadorMenorMedia];

        int posMayores = 0, posMenores = 0;
        for (int num : a) {
            if (num >= media) {
                mayores[posMayores++] = num;
            } else {
                menores[posMenores++] = num;
            }
        }

        // Mostrar el arreglo de los mayores a la media
        System.out.print("Mayores o iguales a la media: ");
        for (int num : mayores) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mostrar el arreglo de los menores a la media
        System.out.print("Menores a la media: ");
        for (int num : menores) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
