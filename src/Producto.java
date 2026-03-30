public class Producto {
    public String nombre;
    public int precio;
    private int stock;
    
    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
        this.nombre = "Vacío";
        this.precio = 0;
        this.stock = 0;
    }

    // formato para poder visualizar la clase
    @Override
    public String toString(){
        return "Producto: " + nombre + '\n' +
                "Precio: " + precio + '\n' +
                "Stock: " + stock; 
    }
}
