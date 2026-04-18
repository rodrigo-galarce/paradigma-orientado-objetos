import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private EstadoReserva estado;
    private Huesped huesped;
    private Alojamiento alojamiento;

    public Reserva(LocalDate fechaInicio, LocalDate fechaFin, Huesped huesped, Alojamiento alojamiento) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = EstadoReserva.CONFIRMADA;
        this.huesped = huesped;
        this.alojamiento = alojamiento;
    }

    public double calcularTotal() {
        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return alojamiento.calcularPrecio((int) dias);
    }

    public Huesped getHuesped() {
        return huesped;
    }
}
