package com.github.lucasefdr.X01Review;

public class X04Loop {
    public static void main(String[] args) {
        System.out.println("\nwhile");
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        System.out.println("\nfor");
        for (int x = 1; x <= 10; x++) System.out.println(x);

        System.out.println("\nfor each");
        String name1 = "Lucas";
        String name2 = "Eduardo";
        String name3 = "Renata";
        String name4 = "Lara";

        String[] arrayNames = {name1, name2, name3, name4};

        for (String name : arrayNames) {
            System.out.println(name);
        }
    }
}
