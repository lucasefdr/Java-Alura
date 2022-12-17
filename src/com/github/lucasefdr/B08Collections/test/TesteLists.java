package com.github.lucasefdr.B08Collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteLists {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais sobre Lists";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        List<String> aulas = new ArrayList<>(Arrays.asList(aula1, aula2, aula3));

        aulas.forEach(System.out::println);
        System.out.println("Tamanho da minha ArrayList: " + aulas.size());

        aulas.remove(0);
        aulas.add("Aumentando o nosso conhecimento");

        Collections.sort(aulas);

        System.out.println();
        aulas.forEach(System.out::println);


    }
}
