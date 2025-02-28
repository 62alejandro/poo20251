package Clase4;

public class Ejecutar {
    public static void main(String[] args) {
        // forma 1
        Vehiculo objvehiculo = new Vehiculo("Toyota", "Blanca", 4500.0, "TS3466WE", 2.3, "150HP");

        // forma 2
        Vehiculo obvehiculo2;
        obvehiculo2 = new Vehiculo("Ferrari", "Rojo", 5000.0, "SEWR567UY", 1.8, "450HP");

        // mostrar la marca del objeto vehiculo
        System.out.println(objvehiculo.getMarca());

        // Se va modificar la marca del vehiculo del objeto objvehiculo
        objvehiculo.setMarca("Chevrolet");

        // Mostrar todo el objeto
        System.out.println(objvehiculo.toString());
        System.out.println(obvehiculo2);

    }

}