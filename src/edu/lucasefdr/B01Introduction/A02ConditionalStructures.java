package edu.lucasefdr.B01Introduction;

import java.util.Scanner;

public class A02ConditionalStructures {
    public static void main(String... args) {
        System.out.println("Testando condicionais");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você não é maior de idade!");
        }
    }
}
