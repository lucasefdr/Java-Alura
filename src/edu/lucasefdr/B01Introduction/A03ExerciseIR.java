package edu.lucasefdr.B01Introduction;

import java.util.Scanner;

public class A03ExerciseIR {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        double salary = scanner.nextDouble();
        double tax, deduction, irValue;

        if (salary < 1900) {
            tax = 0;
            deduction = 0;
        } else if (salary >= 1900 && salary <= 2800) {
            tax = 0.075;
            deduction = 142;
        } else if (salary > 2800 && salary <= 3751) {
            tax = 0.15;
            deduction = 350;
        } else if (salary > 3751 && salary <= 4664) {
            tax = 0.225;
            deduction = 636;
        } else {
            tax = 0.275;
            deduction = 896;
        }

        irValue = salary * tax - deduction;
        System.out.println("Valor do IR: R$" + irValue);

    }
}
