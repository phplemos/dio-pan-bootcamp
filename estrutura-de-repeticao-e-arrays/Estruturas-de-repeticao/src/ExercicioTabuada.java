import java.util.Locale;
import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um valor para saber a tabuada");
        int valor = scan.nextInt();
        System.out.println("Tabuada de: " + valor);
        
        for(int i = 0; i<=10;i++){
            System.out.println(valor + " * " + i + " = " + ( valor * i ));
        }
        System.out.println("Fim");
    }
}
