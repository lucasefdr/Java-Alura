package com.github.lucasefdr.B09Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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
    }
}

class ComparadorPorTamanho implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
}
