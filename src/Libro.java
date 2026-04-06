public class Libro implements Comparable<Libro> {
    public String titulo;
    public String autor;
    public int año;
    public double ISBN;

    public Libro (String titulo, String autor, int año, double ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.ISBN = ISBN;
    }

    @Override
    public int compareTo(Libro otroLibro) {
        return Double.compare(this.ISBN, otroLibro.ISBN);
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + '\n' + "autor: " + autor + '\n' + "año: " + año + '\n' + "ISBN: " + ISBN;
    }
       
}

