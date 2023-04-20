public class OrdemInversa {
    public static void main(String[] args){
        int [] vetorInteiros = {1,2,3,4,5};
        int contador = vetorInteiros.length-1;
        while(contador >= 0){
            System.out.println( vetorInteiros[contador]);
            contador--;
        }

    }
}
