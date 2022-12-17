package com.github.lucasefdr.B08Collections.test;

import java.util.Collection;
import java.util.HashSet;

public class TesteAluno {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Lucas Ferreira");
        alunos.add("Eduardo Ferreira");
        alunos.add("Lara Maria");

        alunos.forEach(System.out::println);

        boolean lucasEstaMatriculado = alunos.contains("Lucas Eduardo");
        System.out.println(lucasEstaMatriculado);
    }
}
