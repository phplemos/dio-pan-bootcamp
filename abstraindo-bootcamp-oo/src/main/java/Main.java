import br.com.dio.desafio.dominio.Curso.Curso;
import br.com.dio.desafio.dominio.Curso.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso JavaScript");
        curso1.setDescricao("descricao curso JavaScript");
        curso1.setCargaHoraria(20);
        System.out.println(curso1.toString());


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
