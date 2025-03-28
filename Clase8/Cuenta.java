public class cuenta {
    private numero;
    private String tipo;
    private double saldo;

    public cuenta ( int numero, String tipo, double saldo){
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String toString (){
        return "Cuenta { Nombre: " + numero +
                          " tipo:" + tipo + 
                            "saldo: " + saldo + }"
    }
}