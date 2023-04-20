import java.util.Random;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length ; i++) {
            for(int j= 0; j<matriz[i].length; j++){
                int numero = random.nextInt(9);
                matriz[i][j] = numero;
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.println(coluna + " ");
            }
            System.out.println();            
        }
    }
}
