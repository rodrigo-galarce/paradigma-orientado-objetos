import java.util.Comparator;

public class LibroComparator implements Comparator <Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.año.compareTo(l2.año);
    }

}
