package com.github.lucasefdr.X01Review;

import java.util.Scanner;

public class X03Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nif-else");

        System.out.println("Enter how old you are: ");
        int age = sc.nextInt();
        boolean condition = age >= 18;

        if (condition) {
            System.out.println("You're under age.");
        } else {
            System.out.println("You're a minor.");
        }

        System.out.println("\nswitch-case");
        int dayOfWeek = 4;
        switch (dayOfWeek) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid");
        }

    }
}
