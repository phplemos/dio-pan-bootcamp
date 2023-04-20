import java.util.Locale;
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        String[] consoante = new String[6];
        int qntConsoantes = 0;
        int contador = 0;
        do {
            System.out.println("Digite uma letra!");
            String letra = scan.next();
            
            if ( !(
                letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u")
            )){
                consoante[contador] = letra;
                qntConsoantes++;
            }

            contador ++;
        } while (contador < consoante.length);

        for ( String consoantes : consoante){
            System.out.println("Letra: " + consoantes);
        }

    }
}
