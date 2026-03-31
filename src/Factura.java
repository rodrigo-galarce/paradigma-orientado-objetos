public class Factura implements Empleado.Pagable {
    int codigoFactura;
    double totalPago;

    public Factura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

   @Override
    public double calcularPago() {
        System.out.println("El pago ha sido realizado.");
        return totalPago;
    }
}