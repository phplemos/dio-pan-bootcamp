import java.util.Locale;
import java.util.Scanner;

public class ExercicioParImpar {
    /**
     * Programa criado no bootcamp da Dio, com intuito de treinar estrutura de
     * repetição
     * 
     * @author Pedro Henrique Pinheiro
     * @param par
     * @param impar
     * @param numeros
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int par = 0;
        int impar = 0;
        int numeros = 0;

        do {
            System.out.println("Digite N numeros inteiros, o loop para ao digitar '-1'");
            numeros = scan.nextInt();
            if (numeros == -1)
                break;
            if (numeros % 2 == 0)
                par++;
            else
                impar++;
        } while (true);
        System.out.println("Foram digitados " + par + " numeros pares \n");
        System.out.println("Foram digitados " + impar + " numeros impares \n");
    }
}
