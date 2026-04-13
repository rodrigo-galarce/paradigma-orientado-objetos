public class Alojamiento implements Reservable {
    protected String titulo;
    protected String ubicacion;
    protected double precioPorNoche;

    public Alojamiento(String titulo, String ubicacion, double precioPorNoche) {
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.precioPorNoche = precioPorNoche;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public double calcularPrecio(int dias) {
        return precioPorNoche;
    }

}
