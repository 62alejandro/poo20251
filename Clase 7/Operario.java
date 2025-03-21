package Clase

public class Operario extends,Trabajador{

    private double horas; 
    public final double SALARIOBASE = 1000; // constante 


// constructor herda de la clase padre  idTrabajador, Nombre, apellido 
    public Operario (int idTrabajador, string nombre, string apellido  double horas){
        super (idTrabajador , nombre, apellido );
        this.horas = horas; 
    }

public double pagar (){
     return SALARIOBASE + horas; 
}

public String toString (){
    return "Operario {idtrabajador: " + super.getidTrabajador()+
            "Nombre:"+ super. getNombre()+
            " Apellido :" + super . getApellido ()+
            "Horas trabajadas: " + horas +  }"; 
}

}
