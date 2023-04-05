package com.github.lucasefdr.X01Review;

public class X05Array {
    public static void main(String[] args) {
        String[] names = {"Lucas", "Eduardo", "Renata", "Lara"};
        Integer[] ages = new Integer[names.length];
        ages[0] = 25;
        ages[1] = 49;
        ages[2] = 47;
        ages[3] = 19;

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + " - Age: " + ages[i]);
        }

        String[] namesClone = names.clone();
        for (String nameClone : namesClone) {
            System.out.println(nameClone);
        }
    }
}
