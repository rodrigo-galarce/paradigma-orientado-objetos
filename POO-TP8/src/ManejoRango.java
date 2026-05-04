import java.util.Scanner;

public class ManejoRango extends Exception{
    Scanner sc = new Scanner(System.in);

    public ManejoRango(String mensaje){
        int[] numeros = {1, 2, 3};
        int variable = Integer.parseInt(sc.nextLine());

        try {
            int valor = numeros[variable];
            System.out.println(numeros[valor]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
