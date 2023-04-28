package dio.phplemos.set;

import java.util.*;

public class ConhecendoMetodosSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,5d,7d,0d,3.6));
        System.out.println(notas.toString());

        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println(soma);
        System.out.println(soma/notas.size());

        notas.remove(0d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next >7) iterator1.remove();
        }
        System.out.println(notas.toString());
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);
        Set<Double> notas3 = new TreeSet<>(notas2);

        System.out.println(notas3);
    }
}
