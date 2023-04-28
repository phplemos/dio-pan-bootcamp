package dio.phplemos.exception;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
    String nomeDoArquivo = "src/main/romances-black-crouch.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (IOException e) {
            JOptionPane.showInputDialog(null,"Revise o nome do arquivo que deseja imprimir!");            throw new RuntimeException(e);
        }finally {
            JOptionPane.showInputDialog(null,"Chegou no finally!");
        }

        System.out.println("Apesar da exception ou nao, o programa continua");
    }

    public static void imprimirArquivoNoConsole(String nomeDoAequivo) throws IOException {
        File  file = new File(nomeDoAequivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }


}
