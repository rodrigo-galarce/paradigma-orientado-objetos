import java.util.HashSet;
import java.util.Set;

public class conjuntoReservas {
    private Set<Reserva> reservas = new HashSet<>();

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }
}
