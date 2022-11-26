package com.github.lucasefdr.B01Introduction;

import java.util.Scanner;

public class A02ConditionalStructures {
    public static void main(String... args) {
        System.out.println("Testando condicionais");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite a quantidade de pessoas: ");
        int quantidadeDePessoas = scanner.nextInt();

        boolean maiorDeIdade = idade >= 18;
        boolean estaAcompanhado = quantidadeDePessoas >= 2;

        if (maiorDeIdade || estaAcompanhado) {
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Você não pode entrar!");
        }
    }
}
