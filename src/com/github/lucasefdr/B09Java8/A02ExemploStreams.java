package com.github.lucasefdr.B09Java8;

import java.util.*;
import java.util.Map.*;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private Integer alunos;

    public Curso(String nome, Integer alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAlunos() {
        return alunos;
    }

    public void setAlunos(Integer alunos) {
        this.alunos = alunos;
    }
}

public class A02ExemploStreams {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("Java", 102));
        cursos.add(new Curso("JavaScript", 99));
        cursos.add(new Curso("C", 31));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos).reversed());
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println();

        System.out.println("*** STREAMS ***");
        System.out.println("Imprimindo todos os cursos com mais de 80 alunos");
        cursos.stream()
                .map(Curso::getAlunos)
                .filter(alunos -> alunos >= 80)
                .forEach(System.out::println);

        System.out.println("Média de alunos");
        OptionalDouble average = cursos.stream()
                .filter(c -> c.getAlunos() >= 80)
                .mapToInt(Curso::getAlunos)
                .average();

        System.out.println(average);

        System.out.println("Soma de alunos dos cursos com mais de 80 matriculados");
        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 80)
                .mapToInt(Curso::getAlunos)
                .sum();

        System.out.println(sum);

        System.out.println();

        System.out.println("Optional");
        Optional<Curso> optionalCurso = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny();

        // Se existir, imprima-o
        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

        System.out.println();

        System.out.println("Collectors");
        // Nova lista de curso com aqueles que tem mais de 90 alunos
        List<Curso> listDeCursosComMaisDe90Alunos = cursos.stream()
                .filter(c -> c.getAlunos() >= 90)
                .collect(Collectors.toList());

        List<Curso> listDeCursosComMaisDe90AlunosJava16 = cursos.stream()
                .filter(c -> c.getAlunos() >= 90)
                .toList();


        // Novo map de curso com aqueles que tem mais de 90 alunos
        Map<String, Integer> mapDeCursosComMaisDe90Alunos = cursos.stream()
                .filter(c -> c.getAlunos() >= 90)
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos));

        Set<Entry<String, Integer>> associacoes = mapDeCursosComMaisDe90Alunos.entrySet();
        associacoes.forEach(c -> {
            System.out.println(c.getKey());
            System.out.println(c.getValue());
        });
    }
}