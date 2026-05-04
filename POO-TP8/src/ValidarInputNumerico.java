public class ValidarInputNumerico extends Exception {
    public int ValidarInputNumerico(String mensage) {
        try {
            return Integer.parseInt(mensage);
        } catch (NumberFormatException e) {
            System.out.println("El numero es erroneo.");
        }
        return 0;
    }
}
