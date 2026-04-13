public class Usuario {
    protected String nombre;
    protected String correoElectronico;
    protected double dni;

    public Usuario(String nombre, String correoElectronico, double dni) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDni() {
        return dni;
    }
}
