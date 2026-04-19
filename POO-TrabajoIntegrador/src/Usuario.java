public class Usuario implements Comparable<Usuario>{
    protected String nombre;
    protected String correoElectronico;
    protected int dni;

    public Usuario(String nombre, String correoElectronico, int dni) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public int compareTo(Usuario otro) {
        return Integer.compare(this.dni, otro.getDni());
    }
}
