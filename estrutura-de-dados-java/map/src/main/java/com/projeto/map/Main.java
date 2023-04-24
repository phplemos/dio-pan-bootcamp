package com.projeto.map;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Map<String,String> aluno1 = new HashMap<>();
        Map<String,String> aluno2 = new HashMap<>();

        aluno1.put("Nome", "joão");
        aluno1.put("Idade", "17");
        aluno1.put("Media", "8.5");
        aluno1.put("turma", "3a");

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "21");
        aluno2.put("Media", "3.2");
        aluno2.put("turma", "1a");

        System.out.println(aluno1.keySet());
        System.out.println(aluno1.values());

        List<Map<String,String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno1.containsKey("Nome"));

    }
}
