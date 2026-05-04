import java.util.Scanner;

public class CalculadoraRobusta extends Exception {
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);

    public CalculadoraRobusta(String msg) {
        super(msg);
        int valor1 = Integer.parseInt(a.nextLine());
        int valor2 = Integer.parseInt(b.nextLine());

        try {
            float suma = valor1 + valor2;
            float resta =  valor1 - valor2;
            float division = (float) valor1 / valor2;
            float multiplicacion = valor1 * valor2;
            } catch (IllegalArgumentException e)  {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
