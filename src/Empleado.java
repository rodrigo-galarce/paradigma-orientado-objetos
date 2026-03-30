public class Empleado {
    protected String nombre;
    protected float sueldo;

    public Empleado(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public float calcularSueldo() {
        return sueldo;
    }
}
