import java.util.Locale;
import java.util.Scanner;

public class ExercicioNome {
    /**
     * Programa criado no bootcamp da Dio, com intuito de treinar estrutura de repetição
     * 
     * @author Pedro Henrique Pinheiro
     * @param nome 
     * @param idade
     *
     */
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        int idade;

        while (true) {
            System.out.println("Digite o nome e idade: ");
            nome = scan.next();
            if (nome.equals("0"))
                break;
            idade = scan.nextInt();
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }

    }
}
