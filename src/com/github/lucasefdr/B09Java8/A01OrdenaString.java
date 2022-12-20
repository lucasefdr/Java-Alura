package com.github.lucasefdr.B09Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class A01OrdenaString {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Alura");
        palavras.add("Editora Casa do Código");
        palavras.add("Caelum");

        Comparator<String> comparator = new ComparadorPorTamanho();

        // Modo antigo de fazer sort "customizado"
        Collections.sort(palavras, comparator);
        System.out.println(palavras);

        System.out.println();

        // Modo novo de fazer sort "customizado" declarando o default method sort(Comparator<>)
        palavras.sort(comparator);
        System.out.println(palavras);

        System.out.println();

        // Usando lambda expression
        System.out.println("sort + comparator com lambda");
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(palavras);

        System.out.println();

        // Usando method reference com o default method comparing()
        System.out.print("method reference");
        palavras.sort(Comparator.comparing(String::length));

        System.out.println();

        // Modo antigo de percorrer uma lista com foreach
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        System.out.println();

        // Modo novo de percorrer uma lista com o default method forEach(Consumer<>)
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println();

        // Usando lambda expression
        palavras.forEach(palavra -> System.out.println(palavra));

        System.out.println();

        // Usando reference method
        palavras.forEach(System.out::println);

        System.out.println();

        // Nova interface Function
        // Dado uma String, me retorne um integer
        Function<String, Integer> function = string -> string.length();
        System.out.println(function.apply("Lucas"));

        // Usando method reference
        Function<String, Integer> functioMethodRef = String::length;
        System.out.println(functioMethodRef.apply("Eduardo"));
    }
}

class ComparadorPorTamanho implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}
