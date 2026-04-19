import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {

    List<Libro> listaLibros;

    public Biblioteca() {
        listaLibros = new ArrayList<>();
    }

    public void agregarLibros(Libro libro){
        listaLibros.add(libro);
    }

    public void borrarLibros(Libro libro){
        Iterator<Libro> it = listaLibros.iterator();
        while(it.hasNext()){
            Libro libroBuscado = it.next();
            if (libroBuscado.getIsbn().equals(libro.getIsbn())){
                it.remove();
                System.out.println("Libro eliminado");
                return;
            }
        }
        System.out.println("Libro no encontrado");
    }

    public void buscarLibros(Libro libro){
        for(Iterator <Libro> i = listaLibros.iterator(); i.hasNext();) {
            Libro libro1 = (Libro) i.next();
            if (libro1.getIsbn().equals(libro.getIsbn())) {
                System.out.println("Libro encontrado: " + libro1);
                return;
            }
        }
        System.out.println("Libro no encontrado");
    }

    public void mostrarLista(){
        for(Iterator <Libro> i = listaLibros.iterator(); i.hasNext();){
            System.out.println(i.next());
        }
    }

}
