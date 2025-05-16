package Clase9;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutarTaller2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Impresion> impresiones = new ArrayList<>();
        ArrayList<Camara> camaras = new ArrayList<>(); // Lista para almacenar cámaras

        int opcion;

        do {
            System.out.println("\n--- Menú Interactivo ---");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Agregar producto");
            System.out.println("3. Crear fotos e impresión");
            System.out.println("4. Registrar cámara");
            System.out.println("5. Mostrar datos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Registrar cliente
                    System.out.print("Ingrese la cédula del cliente: ");
                    String cedula = scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    clientes.add(new Cliente(cedula, nombreCliente));
                    System.out.println("Cliente registrado con éxito.");
                    break;

                case 2:
                    // Agregar producto
                    System.out.print("Ingrese el ID del producto: ");
                    int idProducto = scanner.nextInt();
                    productos.add(new Producto(idProducto));
                    System.out.println("Producto agregado con éxito.");
                    break;

                case 3:
                    // Crear fotos e impresión
                    if (clientes.isEmpty() || productos.isEmpty()) {
                        System.out.println("Debe registrar al menos un cliente y un producto antes de crear una impresión.");
                        break;
                    }

                    Foto[] fotos = new Foto[3];
                    for (int i = 0; i < fotos.length; i++) {
                        System.out.print("Ingrese el nombre de la foto " + (i + 1) + ": ");
                        String nombreFoto = scanner.nextLine();
                        fotos[i] = new Foto(nombreFoto);
                    }

                    System.out.print("Ingrese el tipo de impresión: ");
                    String tipoImpresion = scanner.nextLine();
                    System.out.print("Ingrese la cantidad de impresiones: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    Impresion impresion = new Impresion(tipoImpresion, fotos, cantidad);
                    impresiones.add(impresion);
                    System.out.println("Impresión creada con éxito.");
                    break;

                    case 4:
                    // Registrar cámara
                    System.out.print("Ingrese la marca de la cámara: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo de la cámara: ");
                    String modelo = scanner.nextLine();
                
                    double resolucion = 0;
                    boolean resolucionValida = false;
                    while (!resolucionValida) {
                        System.out.print("Ingrese la resolución de la cámara (en megapíxeles): ");
                        String entradaResolucion = scanner.nextLine();
                        try {
                            resolucion = Double.parseDouble(entradaResolucion);
                            if (resolucion > 0) {
                                resolucionValida = true;
                            } else {
                                System.out.println("La resolución debe ser un número positivo.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número válido (por ejemplo, 12.5).");
                        }
                    }
                
                    camaras.add(new Camara(marca, modelo, resolucion));
                    System.out.println("Cámara registrada con éxito.");
                    break;

                case 5:
                    // Mostrar datos
                    System.out.println("\n--- Clientes Registrados ---");
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente);
                    }

                    System.out.println("\n--- Productos Registrados ---");
                    for (Producto producto : productos) {
                        System.out.println(producto);
                    }

                    System.out.println("\n--- Impresiones Creadas ---");
                    for (Impresion imp : impresiones) {
                        System.out.println(imp);
                    }

                    System.out.println("\n--- Cámaras Registradas ---");
                    for (Camara camara : camaras) {
                        System.out.println(camara);
                    }
                    break;

                case 6:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}