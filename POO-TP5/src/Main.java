public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("hola", "rodrigo", 2010, "a01");
        Libro l2 = new Libro("hola", "rodrigo", 2010, "a02");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibros(l1);
        biblioteca.agregarLibros(l2);
        biblioteca.mostrarLista();

        biblioteca.borrarLibros(l1);
        biblioteca.mostrarLista();

        biblioteca.buscarLibros(l2);

        }
    }
