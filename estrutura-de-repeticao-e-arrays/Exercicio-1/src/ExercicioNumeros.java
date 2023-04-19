import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumeros {
    /**
     * Programa criado no bootcamp da Dio, com intuito de treinar estrutura de
     * repetição
     * 
     * @author Pedro Henrique Pinheiro
     * @param nota
     * 
     *
     */
    public static void main(String [] args) {
        int nota;
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.println("Digite uma nota entre 0 a 10");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor invalido! Digite novamente");
                continue;
            } else {
                System.out.println("Nota foi: " + nota);
                break;
            }
        }
    }
}
