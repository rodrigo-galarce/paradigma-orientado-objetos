import java.time.LocalDate;

public interface Reservable {
    public boolean estaDisponible(LocalDate inicio, LocalDate fin);
}
