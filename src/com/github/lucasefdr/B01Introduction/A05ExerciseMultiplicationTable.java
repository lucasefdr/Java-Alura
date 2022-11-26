package com.github.lucasefdr.B01Introduction;

public class A05ExerciseMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Tabuadas do 1 ao 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
        }
    }
}
