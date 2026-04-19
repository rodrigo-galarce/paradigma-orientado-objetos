import javax.swing.*;
import java.util.Comparator;

public class CompararAnio implements Comparator<Libro> {

    @Override
    public int compare(Libro o1, Libro o2) {
        return Integer.compare(o1.getAnioPublicacion(), o2.getAnioPublicacion());
    }
}
