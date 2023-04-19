import java.util.Locale;
import java.util.Scanner;

public class ExercicioFatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int numero = scan.nextInt();
        int fatorial = 1;

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println("Fatorial de : " + numero + " é: " + fatorial);
    }

}
