package com.github.lucasefdr.B08Collections.test;

import com.github.lucasefdr.B08Collections.domain.Aula;

import java.util.*;

public class TesteListsObjects {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Lista de objetos", 13);
        Aula a3 = new Aula("Collections", 15);

        List<Aula> aulas = new ArrayList<>(Arrays.asList(a1, a2, a3));
        System.out.println(aulas);

        Collections.sort(aulas);
        aulas.forEach(System.out::println);

        System.out.println();

        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.forEach(System.out::println);
    }
}
