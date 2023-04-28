package dio.phplemos.exception;

import javax.swing.*;

public class UncheckedExecption {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador");


        try{
            int resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        }catch (NumberFormatException e){
            JOptionPane.showInputDialog(null,"Entrada invalida, informe um numero inteiro!"+ e.getMessage());
            e.printStackTrace();
        }catch (ArithmeticException e){
            JOptionPane.showInputDialog(null,"IMpossivel ser dividido por zero");
        }
        finally {
            System.out.println("Chegou no finally!");
        }


        System.out.println("O codigo continua...!");
    }

    public static int dividir(int a,int b){return a/b;}


}
