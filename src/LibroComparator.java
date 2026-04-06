import java.util.Comparator;

public class LibroComparator implements Comparator <Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return Integer.compare(l1.año, l2.año);
    }

}
