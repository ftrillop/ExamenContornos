public class CuentaCorriente {
    public String dni;
    public String nombreTitular;
    public double saldo;
    Gestor gestor;


    public CuentaCorriente(String dni, String nombreTitular) {
        this(dni,nombreTitular,0);
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni,"Sin asignar", saldo);
    }

    public CuentaCorriente(String dni, String nombreTitular, double saldo) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombreTitular,double saldo, Gestor gestor) {
        this(dni,nombreTitular,saldo);
        this.gestor = gestor;
    }

    void setGestor (Gestor gestor) {
        this.gestor = gestor;
    }

    boolean sacarDinero(double cantidad) {
        boolean operacionCorrecta;
        if (saldo >=cantidad) {
            saldo-=cantidad;
            operacionCorrecta = true;
        }
        else {
            System.out.println("No hay saldo suficiente");
            operacionCorrecta = false;
        }
        return operacionCorrecta;

    }

    void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    void mostrarInformacion() {
        if (gestor == null)
            System.out.println("No hay gestor asignado");
        else
            System.out.println(gestor.toString());

        System.out.printf("Nombre: %s \nDNI: %s \nSaldo: %.2f\n\n",nombreTitular,dni,saldo);
    }
}
