package dio.phplemos.set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> arcoIris = new TreeSet<>(){{
            add("vermelho");
            add("laranja");
            add("amarela");
            add("verde");
            add("azul");
            add("anil");
            add("violeta");
        }};
        for(String cor:arcoIris) System.out.println(cor);

        System.out.println("O Arco-Iris tem: " + arcoIris.size() + " cores! ");

        Set<String> reverso = new LinkedHashSet<>(arcoIris);
        System.out.println(reverso);



    }
}
