package com.github.lucasefdr;

public class B05JavaLang {
    public static void main(String[] args) {
        String name = "Lucas";
        char[] nameToCharArray = name.toCharArray();

        for (char letter : nameToCharArray) {
            System.out.println(letter);
        }

        name = name.replace("L", "l");

        System.out.println(name);
    }
}
