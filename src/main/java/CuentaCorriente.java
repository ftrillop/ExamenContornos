/**
 * Clase cuentaCorriente
 */
public class CuentaCorriente {
    public String dni;
    public String nombreTitular;
    public double saldo;
    Gestor gestor;

    /**
     * Constructor de CuentaCorriente con 2 parametros
     * El saldo toma el valor 0
     * @param dni Valor de la variable dni
     * @param nombreTitular valor de la variable nombreTitular
     */
    public CuentaCorriente(String dni, String nombreTitular) {
        this(dni,nombreTitular,0);
    }
    /**
     * Constructor de CuentaCorriente con 2 parametros
     * nombreTitular toma como valor "Sin asignar"
     * @param dni Valor de la variable dni
     * @param saldo Valor de la variable saldo
     */
    public CuentaCorriente(String dni, double saldo) {
        this(dni,"Sin asignar", saldo);
    }
    /**
     * Constructor de CuentaCorriente con 3 parametros
     * @param dni Valor de la variable dni
     * @param nombreTitular Valor de la variable nombreTitular
     * @param saldo Valor de la variable saldo
     */
    public CuentaCorriente(String dni, String nombreTitular, double saldo) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    /**
     * Constructor de CuentaCorriente con 4 parametros
     * @param dni Valor de la variable dni
     * @param nombreTitular Valor de la variable nombreTitular
     * @param saldo Valor de la variable saldo
     * @param gestor Valor del objeto gestor
     */
    public CuentaCorriente(String dni, String nombreTitular,double saldo, Gestor gestor) {
        this(dni,nombreTitular,saldo);
        this.gestor = gestor;
    }
    /**
     * Asigna al gestor un valor
     * @param gestor
     */
    void setGestor (Gestor gestor) {
        this.gestor = gestor;
    }
    /**
     * Retira una cantidad del saldo de la cuenta si la cantidad es inferior al saldo
     * Si se retira la cantidad el saldo se reduce
     * Si no hay suficiente se indica que no hay suficiene saldo
     * @param cantidad Valor de la cantidad de dinero a retirar
     * @return
     */
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
    /**
     * Ingresa en el saldo la cantidad indicada
     * @param cantidad Valor del importe que se esta ingresando
     */
    void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }
    /**
     * Muestra el gestor si hay uno asignado
     * Indica despues los valores del nombre del titular, dni y saldo
     */
    void mostrarInformacion() {
        if (gestor == null)
            System.out.println("No hay gestor asignado");
        else
            System.out.println(gestor.toString());

        System.out.printf("Nombre: %s \nDNI: %s \nSaldo: %.2f\n\n",nombreTitular,dni,saldo);
    }
}
