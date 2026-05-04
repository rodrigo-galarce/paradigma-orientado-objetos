public class Main {

    public static void main(String[] args) {
        try {
            int edad = -10;
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad no puede ser negativa");
            }
        } catch(EdadInvalidaException e){
            System.out.println("Edad invalida: " + e.getMessage());
        }
    }
}