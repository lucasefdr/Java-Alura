package com.github.lucasefdr.B08Collections.test;

import com.github.lucasefdr.B08Collections.domain.Aluno;
import com.github.lucasefdr.B08Collections.domain.Aula;
import com.github.lucasefdr.B08Collections.domain.Curso;

import java.util.List;

public class TesteCursoAluno {
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

        System.out.println("Lista de alunos matriculados");
        javaCollections.getAlunos().forEach(System.out::println);

    }
}
