public abstract class Departamento extends Alojamiento {
    private boolean tieneAscensor;
    private int piso;

    public Departamento(String titulo, String ubicacion, double precioPorNoche, boolean tieneAscensor, int piso) {
        super(titulo, ubicacion, precioPorNoche);
        this.tieneAscensor = tieneAscensor;
        this.piso = piso;
    }

    @Override
    public double calcularPrecio(int dias) {
        double precio = precioPorNoche;
        if (this.tieneAscensor){
            precio += precio * 0.20;
        }
        return precio;
    }
}
