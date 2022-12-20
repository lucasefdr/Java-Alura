package com.github.lucasefdr.B09Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
                .filter(c -> c.getAlunos() >= 80)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        System.out.println("Soma de alunos dos cursos com mais de 80 matriculados");
        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 80)
                .mapToInt(Curso::getAlunos)
                .sum();

        System.out.println(sum);


    }
}
