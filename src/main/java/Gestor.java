/**
 * Clase Gestor
 */
public class Gestor {
    public String nombre;
    public double importeAutorizado;
    public String telefono;
    /**
     * Constructor de Gestor
     * Proporciona los valores a las variables del objeto
     * @param nombre Valor de la variable nombre
     * @param telefono Valor de la variable telefono
     * @param importeAutorizado Valor de la variable importeAutorizado
     */
    public Gestor(String nombre, String telefono, double importeAutorizado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeAutorizado = importeAutorizado;
    }
    /**
     * Constructor de Gestor usando solo 2 parametros
     * El valor de importeAutorizado vale 10000
     * @param nombre Valor de la variable nombre
     * @param telefono Valor de la variable telefono
     */
    public Gestor(String nombre, String telefono) {
        this(nombre,telefono, 10000);
    }
    /**
     * Devuelve por retorno el Gestor con los valores que se le asignaron
     * @return
     */
    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", importeAutorizado=" + importeAutorizado +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
