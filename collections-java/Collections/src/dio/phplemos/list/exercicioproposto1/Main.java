package dio.phplemos.list.exercicioproposto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        List<Double> temperaturaMedia = new ArrayList<>(6);
        Double mediaSemestral = 0d;

        for(int i= 0; i < 6;i++){
            temperaturaMedia.add(scan.nextDouble());
            mediaSemestral += temperaturaMedia.get(i);
        }
        mediaSemestral /= 6;
        for(int i = 0; i< 6; i++){
            if(temperaturaMedia.get(i) > mediaSemestral){
                Double temp = temperaturaMedia.get(i);
                    switch (i) {
                        case (0):
                            System.out.printf("1 - janeiro: %.1f\n ", temp);
                            break;
                        case (1):
                            System.out.printf("2 - fevereiro: %.1f\n", temp);
                            break;
                        case (2):
                            System.out.printf("3 - março: %.1f\n", temp);
                            break;
                        case (3):
                            System.out.printf("4 - abril: %.1f\n", temp);
                            break;
                        case (4):
                            System.out.printf("5 - maio: %.1f\n", temp);
                            break;
                        case (5):
                            System.out.printf("6 - junho: %.1f\n", temp);
                            break;
                        default:
                            System.out.println("Não houve temperatura acima da média.");
                    }
            }
        }

    }
}
