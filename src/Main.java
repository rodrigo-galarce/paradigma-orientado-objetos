public class Main {
    public static void main(String[] args) {
        CuentaBancaria Rodrigo = new CuentaBancaria(12, "Rodrigo Galarce");
        float verNuevoSaldo = Rodrigo.depositar(100);
        float verExtraccion = Rodrigo.extraer(50);
        System.out.println("Su nuevo saldo es: " + verNuevoSaldo);
        System.out.println("Usted ha extraído: " + verExtraccion);

        Producto Vacio = new Producto();
        Producto Coca = new Producto("Coca Cola",1000, 1);
        System.out.println("Datos del producto 'Agua': " + Vacio);
        System.out.println("Datos del producto 'Coca Cola': " + Coca);

        EmpleadoContratado Juanchi = new EmpleadoContratado("Juanchi", 1000, 120, 50000);
        System.out.println("Juanchi: " + Juanchi.calcularSueldo());
     }
}