public abstract class Casa extends Alojamiento {
    private boolean tieneJardin;
    private boolean tienePileta;

    public Casa(String titulo, String ubicacion, double precioPorNoche, boolean tieneJardin, boolean tienePileta) {
        super(titulo, ubicacion, precioPorNoche);
        this.tieneJardin = tieneJardin;
        this.tienePileta = tienePileta;
    }

    @Override
    public double calcularPrecio(int dias) {
        double precio = getPrecioPorNoche() * dias;

        if (tieneJardin) {
            precio *= 1.25;
        }

        if (tienePileta) {
            precio *= 1.30;
        }

        return precio;
    }
}
