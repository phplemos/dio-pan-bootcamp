import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaiorMedia {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int numeros;
        double media = 0;
        int maior = 0;
        int aux = 0;
        int contador=0;
        do{
            System.out.println("Digite um valor");
            numeros = scan.nextInt();
            aux += numeros;
            if(numeros > maior){
                maior = numeros;
            }
            contador++;
        } while (contador < 5);
        media = (double) aux / (double) contador;
        System.out.println("A media dos valores é: " + media);
    }
}