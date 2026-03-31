public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double calcularSueldo() {
        return sueldo;
    }

    interface Pagable {
        double calcularPago();
    }
}
