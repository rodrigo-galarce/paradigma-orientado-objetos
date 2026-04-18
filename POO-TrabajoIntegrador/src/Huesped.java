public class Huesped extends Usuario {

    public Huesped(String nombre, String correoElectronico, double dni) {
        super(nombre, correoElectronico, dni);
    }

    public void buscarReserva(conjuntoReservas conjunto) {
        for (Reserva reserva : conjunto.getReservas()) {
            if (reserva.getHuesped().equals(this)) {
                System.out.println(reserva);
            }
        }
    }
}
