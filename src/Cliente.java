public class Cliente {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        if (nombre == null) {
            System.out.println("El nombre no puede ser null");
        }
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarEmail() {
        System.out.println("Email: " + email);
    }

    public String obtenerEmail() {
        return email;
    }
}
