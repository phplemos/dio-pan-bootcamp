import br.com.dio.desafio.dominio.Curso.*;

import java.time.LocalDate;
import java.util.ArrayList;

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

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp java developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos" + devPedro.getConteudoInscritos());
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devPedro.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + devPedro.getConteudoConcluidos());
        System.out.println("============");
        System.out.println("XP: " + devPedro.calcularTotalXp());
        devPedro.progredir();
        System.out.println("XP: " + devPedro.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devCamila.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + devCamila.getConteudoConcluidos());
        System.out.println("============");
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}
