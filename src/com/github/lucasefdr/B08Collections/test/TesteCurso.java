package com.github.lucasefdr.B08Collections.test;

import com.github.lucasefdr.B08Collections.domain.Aula;
import com.github.lucasefdr.B08Collections.domain.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        List<Aula> aulasImutaveis = javaCollections.getAulas();
        System.out.println(aulasImutaveis);

        // aulasImutaveis.add(new Aula("Trabalhando com ArrayList", 21));
        javaCollections.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaCollections.adiciona(new Aula("Collections", 19));

        System.out.println(aulasImutaveis);
        System.out.println();

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);

        aulas.forEach(System.out::println);
        System.out.println(javaCollections.getTempoTotal());
        System.out.println(javaCollections);
    }
}
