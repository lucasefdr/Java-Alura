package com.github.lucasefdr.B08Collections.test;

import com.github.lucasefdr.B08Collections.domain.Aluno;
import com.github.lucasefdr.B08Collections.domain.Aula;
import com.github.lucasefdr.B08Collections.domain.Curso;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteBuscaAlunoPorMatricula {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        List<Aula> aulasImutaveis = javaCollections.getAulas();
        System.out.println(aulasImutaveis);

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaCollections.adiciona(new Aula("Collections", 19));

        Aluno a1 = new Aluno("Lucas Eduardo", 31232);
        Aluno a2 = new Aluno("Vitor Oliveira", 34100);

        javaCollections.matricula(a1);
        javaCollections.matricula(a2);

        System.out.println("Quem é o aluno com matrícula 34100?");
        Aluno aluno = javaCollections.buscaMatricula(34100);

        System.out.println(aluno);
        System.out.println();

        Map<Integer, String> pessoas = new LinkedHashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

//        pessoas.keySet().forEach(idade -> {
//            System.out.println(pessoas.get(idade));
//        });

        pessoas.values().forEach(System.out::println);
        System.out.println();

        Set<Entry<Integer, String>> associations = pessoas.entrySet();
        for (Entry<Integer, String> association : associations) {
            System.out.println(association.getValue() + " tem " + association.getKey() + " anos.");
        }
    }
}
