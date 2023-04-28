package dio.phplemos.list.exercicio;


import java.util.*;

public class Collections {
    public static void main(String[] args) {

        List<Gato>  meusGatos = new ArrayList<>(){{
            add(new Gato("Justina",3,"Trigrada laranja"));
            add(new Gato("Bolota",1,"Trigrada cinza"));
            add(new Gato("Salem",1,"Preto"));
        }};
        System.out.println("Por Ordem de inserção: ");
        System.out.print(meusGatos);

        System.out.println("Por Ordem de aleatoria: ");
        java.util.Collections.shuffle(meusGatos);
        System.out.print(meusGatos);

        System.out.println("Por ordem natural (Nome)");
        java.util.Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de idade");

    }

}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
