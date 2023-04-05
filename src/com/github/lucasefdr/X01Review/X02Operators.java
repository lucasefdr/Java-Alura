package com.github.lucasefdr.X01Review;

public class X02Operators {
    public static void main(String[] args) {
        System.out.println("\nAssignment operators");
        int x = 10;
        x += 5;
        System.out.println(x); // x = 15

        x -= 10;
        System.out.println(x); // x = 5

        System.out.println("\nArithmetic operators");
        int num1 = 10;
        int num2 = 4;

        int sum = num1 + num2;
        int sub = num1 - num2;
        int div = num1 / num2;
        int mul = num1 * num2;
        int res = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Division: " + div);
        System.out.println("Multiplication: " + mul);
        System.out.println("Rest of division: " + res);

        System.out.println("\nLogical operators");
        num1 = 25;
        num2 = 40;
        int num3 = 5;

        if (num1 > num2 || num3 < num1) System.out.println("It's true!"); // true
        if (num1 > num2 && num3 < num1) System.out.println("It's true!"); // false
        if (!(num1 > num2)) System.out.println("It's true!"); // true
    }
}
