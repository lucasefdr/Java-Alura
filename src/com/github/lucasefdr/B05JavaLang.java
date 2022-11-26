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
        name = name.replace('l', 'L' );
        System.out.println(name);

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('a' ));
        System.out.println(name.length());
        System.out.println(name.substring(2, 5));
        System.out.println(name.contains("Luc"));
    }
}
