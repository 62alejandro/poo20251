public class Ejecutar {
    public static void main(String[] args) {
        // forma 1
        Vehiculo objVehiculo = new Vehiculo("Toyota", "Blanca", 4500.0, "TS3466WE", 2.3, "150HP");

        // forma 2
        Vehiculo objVehiculo2;
        objVehiculo2 = new Vehiculo("Ferrari", "Rojo", 5000.0, "SEWR567UY", 1.8, "450HP");

        // mostrar la marca del objeto vehiculo
        System.out.println(objVehiculo.getMarca());

        // Se va modificar la marca del vehiculo del objeto objvehiculo
        objVehiculo.setMarca("Chevrolet");

        // Mostrar todo el objeto
        System.out.println(objVehiculo.toString());
        System.out.println(objVehiculo2);

        System.out.println(objVehiculo.getMarca());
        objVehiculo.acelerar();

        System.out.println(objVehiculo2.getMarca());
        objVehiculo2.frenar();
    }

}