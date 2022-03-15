public class Gestor {
    public String nombre;
    public double importeAutorizado;
    public String telefono;

    public Gestor(String nombre, String telefono, double importeAutorizado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeAutorizado = importeAutorizado;
    }

    public Gestor(String nombre, String telefono) {
        this(nombre,telefono, 10000);
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", importeAutorizado=" + importeAutorizado +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
