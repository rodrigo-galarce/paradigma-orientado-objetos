import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private List<Usuario> usuarios;
    private List<Alojamiento> alojamientos;
    private List<Reserva> reservas;

    public Plataforma() {
        usuarios = new ArrayList<>();
        alojamientos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        alojamientos.add(alojamiento);
    }

    public void crearReserva(Huesped huesped, Alojamiento alojamiento) {
        Reserva nuevaReserva = new Reserva(LocalDate.of(2026,4,5),
                                LocalDate.of(2026,5,1),
                                huesped, alojamiento);
        reservas.add(nuevaReserva);
    }

}
