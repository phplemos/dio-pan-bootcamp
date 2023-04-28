package dio.phplemos.map;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve História do tempo",256));
            put("Duhigg, Charles", new Livro("O poder do hábito",408));
            put("Harari, Yuval Noah", new Livro("Lições para o seculo XXI",432));
        }};

        for (Map.Entry<String, Livro> livro: meusLivros.entrySet()){
            System.out.println("Author: " + livro.getKey());
            System.out.println("Livro: " + livro.getValue().getNome());
            System.out.println("Paginas: " + livro.getValue().getPaginas());

        }

        Map<String,Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve História do tempo",256));
            put("Duhigg, Charles", new Livro("O poder do hábito",408));
            put("Harari, Yuval Noah", new Livro("Lições para o seculo XXI",432));
        }};

        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet()) {
            System.out.println(livro.getKey()+ " - "+livro.getValue().getNome());
        }

        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
        for (Map.Entry<String, Livro> livro: meusLivros3.entrySet()){
            System.out.println(livro.getKey()+" - " + livro.getValue().getNome());
        }

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros3.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivros4){
            System.out.println(livro.getKey()+" - " + livro.getValue().getNome());
        }
    }


}

class Livro {
    public String nome;
    public Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{
    @Override
    public int compare(Map.Entry<String,Livro> l1,Map.Entry<String,Livro> l2){
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());

    }
}